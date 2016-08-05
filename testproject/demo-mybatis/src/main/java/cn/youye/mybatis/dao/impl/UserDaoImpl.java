package cn.youye.mybatis.dao.impl;

import cn.youye.mybatis.dao.UserDao;
import cn.youye.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by pc on 2016/6/16.
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionFactory sqlSessionFactory;

    /*
     *在没有和spring整合的情况下通过构造函数注入
     *通过构造函数注入sqlSessionFactory
     */
    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User getById(int id) throws SQLException {
        //SqlSession是线程不安全的，只能放在方法体内，定义成局部变量
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("userTest.getById", id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> getByName(String name) throws SQLException {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession.selectList("userTest.getByName", name);
    }

    @Override
    public void insertUser(User user) throws SQLException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("userTest.adduser", user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void updateUser(User user) throws SQLException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.update("userTest.updateuser", user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteUser(int id) throws SQLException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.update("userTest.deleteuser", id);
        sqlSession.commit();
        sqlSession.close();
    }
}
