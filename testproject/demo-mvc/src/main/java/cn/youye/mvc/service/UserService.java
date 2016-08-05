package cn.youye.mvc.service;

import cn.youye.mvc.dao.UserDao;
import cn.youye.mvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by pc on 2016/7/12.
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User get(User user) {
        user.setId("b41f12fd-4807-11e6-ba31-408d5cc10d3b");
        return userDao.get(user);
    }
}
