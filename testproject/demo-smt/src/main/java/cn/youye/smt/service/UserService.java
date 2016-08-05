package cn.youye.smt.service;

import cn.youye.smt.dao.UserDao;
import cn.youye.smt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by pc on 2016/6/17.
 */
@Service
@Transactional(readOnly = true)
public class UserService {

    @Autowired
    UserDao userDao;

    public User get(User user){
        return userDao.get(user);
    }

    public List<User> findList(User user){
        return userDao.findList(user);
    }
}
