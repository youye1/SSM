package cn.youye.mybatis.mapper;

import cn.youye.mybatis.pojo.User;
import cn.youye.mybatis.pojo.UserCustom;
import cn.youye.mybatis.pojo.UserQueryVo;

import java.sql.SQLException;
import java.util.List;


/**
 * 使用mapper代理方法
 * 遵照开发规范，mybatis可以自动生成mapper的接口实现代理对象(通过反射机制)
 * 规则如下：
 * Created by pc on 2016/4/11.
 */
public interface UserMapper {

    //mapper.java中的方法和mapper.xml中statement的id一致
    //mapper.java中方法的参数类型和mapper.xml的输入参数类型(parapeterType)一致
    //返回值类型也一致
    //缺陷在于 只能有一个参数 因此可以使用包装类型的pojo满足不同业务的需求、
    //持久层方法中的参数可以使用包装类型，但是service方法中不建议使用，不利于业务的维护和可扩展性。
    public User getById(int id) throws SQLException;

    public List<User> getByName(String name) throws SQLException;

    public List<User> getAll() throws SQLException;

    public List<UserCustom> getUserList(UserQueryVo userQueryVo) throws SQLException;

    public List<User> getUserListResultMap(String name) throws SQLException;

    public List<User> getByNameAndAddress(User user) throws SQLException;

    public void adduser(User user) throws SQLException;

    public void updateuser(User user) throws SQLException;

    public void deleteuser(int id) throws SQLException;

    //多对多的映射查询查询
    public List<User> getUserAndItemsResultMap()throws SQLException;


}
