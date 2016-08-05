package cn.youye.mybatis.jdbo;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by pc on 2016/4/8.
 */
public class jdbcpool implements DataSource {

    public static LinkedList<Connection> listConnection = new LinkedList<Connection>();

    static {
        InputStream in = jdbcpool.class.getClassLoader().getResourceAsStream("dbconfig.properties");
        Properties properties = new Properties();
        try {
            properties.load(in);
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            //初始化数据库连接池的大小
            int jdbcPoolInitSize = Integer.parseInt(properties.getProperty("jdbcPoolInitSize"));
            //加载数据库连接驱动
            Class.forName(driver);
            for (int i = 0; i < jdbcPoolInitSize; i++) {
                Connection conn = DriverManager.getConnection(url, username, password);
                System.out.println("======获取了数据库连接：" + conn);
                listConnection.add(conn);
            }
        } catch (IOException e) {
            System.out.println("======读取配置文件出错=====");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     *
     * @return
     * @throws SQLException
     */
    public Connection getConnection() throws SQLException {
        if (listConnection.size() > 0) {
            //从list中获取一个数据库连接
            final Connection conn = listConnection.removeFirst();
            System.out.println("=====数据库连接池的大小是：" + listConnection.size());
            //返回Connection对象的代理对象
            return (Connection) Proxy.newProxyInstance(jdbcpool.class.getClassLoader(),

                    conn.getClass().getInterfaces(),
                    new InvocationHandler() {
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            if (!method.getName().equals("close")) {
                                return method.invoke(conn, args);
                            } else {
                                //如果调用close方法，则把数据库连接还给list
                                listConnection.add(conn);
                                System.out.println("====" + conn + "被还给了listConnection=====");
                                System.out.println("listConnection数据库连接数大小为：" + listConnection.size());
                                return null;
                            }
                        }
                    });
        } else {
            throw new RuntimeException("对不起数据库正忙");
        }
    }

    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    public void setLoginTimeout(int seconds) throws SQLException {

    }

    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
