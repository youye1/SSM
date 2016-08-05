package cn.youye.sptest.bean;

import cn.youye.sptest.dao.HelloDao;

/**
 * Created by pc on 2016/7/12.
 */
public class HelloDaoImpl implements HelloDao {

    private String message;

    @Override
    public void sayHello() {
        System.out.println("============" + message);
    }

    /**
     * 空构造方法
     */
    public HelloDaoImpl() {
        this.message = "hello Spring";
    }

    /**
     * 带参构造方法
     */
    public HelloDaoImpl(String message) {
        this.message = message;
    }
}
