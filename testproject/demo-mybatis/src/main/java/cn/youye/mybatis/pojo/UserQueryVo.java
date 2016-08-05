package cn.youye.mybatis.pojo;

import java.util.List;

/**
 * 用户的包装类型
 * Created by pc on 2016/4/11.
 */
public class UserQueryVo {

    //包装需要的查询条件
    private List<Integer> ids;
    //用户查询条件
    private UserCustom userCustom;

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public List<Integer> getIds() {
        return ids;
    }

    //可以包装其他的查询条件，如 商品、订单等


}
