package cn.youye.mybatis.dao;

import cn.youye.mybatis.pojo.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by pc on 2016/6/16.
 */
public interface UserDao {
    public User getById(int id) throws SQLException;
    public List<User> getByName(String name) throws SQLException;
    public void insertUser(User user)throws SQLException;
    public void updateUser(User user) throws SQLException;
    public void deleteUser(int id)throws SQLException;
}
