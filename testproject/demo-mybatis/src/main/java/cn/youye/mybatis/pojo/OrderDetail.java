package cn.youye.mybatis.pojo;

/**
 * Created by pc on 2016/4/12.
 */
public class OrderDetail {
    private int id;
    private int ordersId;
    private int itemsId;
    private int itemsNum;

    //添加Items对象
    private Items items;

    public void setId(int id) {
        this.id = id;
    }

    public void setItemsId(int itemsId) {
        this.itemsId = itemsId;
    }

    public void setItemsNum(int itemsNum) {
        this.itemsNum = itemsNum;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public int getId() {
        return id;
    }

    public int getItemsId() {
        return itemsId;
    }

    public int getItemsNum() {
        return itemsNum;
    }

    public int getOrdersId() {
        return ordersId;
    }
//
//    @Override
//    public String toString() {
//        return "OrderDetail{" +
//                "id=" + id +
//                ", ordersId=" + ordersId +
//                ", itemsId=" + itemsId +
//                ", itemsNum=" + itemsNum +
//                '}';
//    }

    /**
     * 多对多映射查询
     * @return
     */
    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", itemsId=" + itemsId +
                ", itemsNum=" + itemsNum +
                ", items=" + items +
                '}';
    }
}
