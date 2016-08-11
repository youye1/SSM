package cn.youye.factory.bean;

import cn.youye.factory.dao.HelloDao;
import cn.youye.factory.dao.impl.HelloDaoImpl;

/**
 * Created by pc on 2016/7/12.
 */
public class HelloInstanceFactory {

    public HelloDao newInstance(String message) {
        return new HelloDaoImpl(message);
    }
}
