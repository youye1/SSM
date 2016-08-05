package cn.youye.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 二级缓存测试 需要使pojo对象实现序列化，即扩展接口 Serializable
 * 目的：为了将缓存数据取出，执行反序列化操作
 * 原因：二级缓存数据的存储介质是多种多样的，不一定在内存
 * Created by pc on 2016/4/8.
 */
public class User implements Serializable{
    private int id;     //用户id
    private String username;//用户名
    private Date birthday;  //用户生日
    private String sex;     //性别
    private String address; //地址

    //添加orderList
    //多对多映射 显示用户的所有订单信息。
    private List<Order> orderList;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getUsername() {
        return username;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", birthday=" + birthday +
//                ", sex='" + sex + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }


    /**
     *多对多的映射显示
     */
//    @Override
//    public String toString() {
//        return "User{" +
//                "  id=" + id +
//                ", username='" + username + '\'' +
//                ", sex='" + sex + '\'' +
//                ", address='" + address + '\'' +
//                ", birthday=" + birthday +
//                ", orderList=" + orderList +
//                '}';
//    }


    /**
     * 延迟加载 订单表关联用户表
     * @return
     */
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                '}';
    }
}
