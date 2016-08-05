package cn.youye.sptest.bean;

import cn.youye.sptest.dao.HelloDao;

/**
 * Created by pc on 2016/7/12.
 */
public class HelloInstanceFactory {

    public HelloDao newInstance(String message) {
        return new HelloDaoImpl(message);
    }
}
