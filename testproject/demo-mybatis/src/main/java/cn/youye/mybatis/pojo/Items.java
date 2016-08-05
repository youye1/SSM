package cn.youye.mybatis.pojo;

import java.util.Date;

/**
 * Created by pc on 2016/4/12.
 */
public class Items {
    private int id;
    private String name;
    private float price;
    private String detail;
    private String pic;
    private Date createTime;

    public void setId(int id) {
        this.id = id;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public float getPrice() {
        return price;
    }

    public String getDetail() {
        return detail;
    }

    public String getName() {
        return name;
    }

    public String getPic() {
        return pic;
    }

//    @Override
//    public String toString() {
//        return "Items{" +
//                "createTime=" + createTime +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                ", detail='" + detail + '\'' +
//                ", pic='" + pic + '\'' +
//                '}';
//    }

    /**
     * 多对多映射查询
     * @return
     */
    @Override
    public String toString() {
        return "Items{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                ", pic='" + pic + '\'' +
                '}';
    }
}
