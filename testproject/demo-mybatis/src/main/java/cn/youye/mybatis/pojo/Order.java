package cn.youye.mybatis.pojo;

import java.util.Date;
import java.util.List;

/**
 * Created by pc on 2016/4/12.
 */
public class Order {
    private int id;
    private int userId;
    private String number;
    private Date createTime;
    private String note;

    //添加用户信息
    private User user;

    //添加orderdetail列表对象
    private List<OrderDetail> orderDetails;

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getNote() {
        return note;
    }

    public String getNumber() {
        return number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //    @Override
//    public String toString() {
//        return "Order{" +
//                "id=" + id +
//                ", userId=" + userId +
//                ", number='" + number + '\'' +
//                ", createTime=" + createTime +
//                ", note='" + note + '\'' +
//                '}';
//    }


    /*
     *测试一对一映射 返回resultMap 输出
     */
//    @Override
//    public String toString() {
//        return "Order{" +
//                "createTime=" + createTime +
//                ", id=" + id +
//                ", userId=" + userId +
//                ", number='" + number + '\'' +
//                ", note='" + note + '\'' +
//                ", username=" + user.getUsername() +
//                ", sex=" + user.getSex() +
//                ", address=" + user.getAddress() +
//                '}';
//    }

    /*
     *测试一对多映射 返回resultMap 输出
     */
//    @Override public String toString() {
//        String str="";
//        for (int i = 0; i < orderDetails.size(); i++) {
//            str+=orderDetails.get(i);
//        }
//        return "Order{" +
//                "id=" + id +
//                ", createTime=" + createTime +
//                ", userId=" + userId +
//                ", number='" + number + '\'' +
//                ", note='" + note + '\'' +
//                ", username=" + user.getUsername() +
//                ", sex=" + user.getSex() +
//                ", address=" + user.getAddress() +
//                ", orderDetails=" + orderDetails +
//                '}';
//    }


    /**
     * 多对多映射的查询情况
     * @return
     */
//    @Override
//    public String toString() {
//        return "Order{" +
//                " id=" + id +
//                ", number='" + number + '\'' +
//                ", createTime=" + createTime +
//                ", note='" + note + '\'' +
//                ", orderDetails=" + orderDetails +
//                '}';
//    }


    /**
     * 延迟加载 查询订单关联用户
     * @return
     */
    @Override
    public String toString() {
        return "Order{" +
                "createTime=" + createTime +
                ", id=" + id +
                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
