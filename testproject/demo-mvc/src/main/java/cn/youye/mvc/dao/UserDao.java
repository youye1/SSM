package cn.youye.mvc.dao;

import cn.youye.mvc.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by pc on 2016/7/12.
 */
@Repository("userDao")
public interface UserDao {

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User get(User user);
}
