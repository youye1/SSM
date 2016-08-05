package cn.youye.mybatis.jdbo;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Created by pc on 2016/4/8.
 */
public class ConnectionFactory  {
    private static String driver;
    private static String url;
    private static String username;
    private static  String password;

    private Connection connection;

    private static final ConnectionFactory factory=new ConnectionFactory();

    static {
        Properties properties=new Properties();
        try {
            InputStream in=ConnectionFactory.class.getClassLoader()
                    .getResourceAsStream("dbconfig.properties");
            properties.load(in);
        } catch (IOException e) {
            System.out.println("读取配置文件出错");
            e.printStackTrace();
        }
        driver=properties.getProperty("driver");
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");
    }

    private ConnectionFactory(){

    }
    public static ConnectionFactory getInstance(){
        return factory;
    }
    public Connection makeConnection(){
        try {
            Class.forName(driver);
            connection= DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            System.out.println("数据库连接异常");
            e.printStackTrace();
        }
        return connection;
    }

}
