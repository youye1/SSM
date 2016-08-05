package cn.youye.mybatis.pojo;
/**
 * Created by pc on 2016/4/12.
 */
public class OrderCustom extends Order {

    //添加用户属性
    private String username;
    private String sex;
    private String address;


    @Override
    public String toString() {
        return "OrderCustom{" +
                "id="+getUserId()+
                ",number='"+getNumber()+'\'' +
                ",createtime='"+getCreateTime()+'\'' +
                "address='" + address + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
