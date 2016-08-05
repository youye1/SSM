package cn.youye.sptest.bean;

import cn.youye.sptest.dao.HelloDao;

/**
 * 使用静态工厂
 * Created by pc on 2016/7/12.
 */
public class HelloStaticFactory {

    public static HelloDao newInstance(String message) {
        return new HelloDaoImpl(message);
    }
}
