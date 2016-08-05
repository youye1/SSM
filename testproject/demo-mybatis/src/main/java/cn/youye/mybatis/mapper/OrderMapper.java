package cn.youye.mybatis.mapper;

import cn.youye.mybatis.pojo.Order;
import cn.youye.mybatis.pojo.OrderCustom;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by pc on 2016/6/16.
 */
public interface OrderMapper {
    // 一对一查询映射，返回resultType
    public List<OrderCustom> getOrderUser() throws SQLException;

    //一对一查询，返回resultMap
    public List<Order> getOrderUserResultMap() throws SQLException;

    //一对多查询，返回resultMap
    public List<Order> getOrdersAndOrderdetailResultMap() throws SQLException;


    //延迟加载查询 通过association将用户表关联到order表
    public List<Order> getOrderUserLazyLoading() throws  SQLException;
}
