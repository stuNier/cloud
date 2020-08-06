package com.zx.order.mapper;

import com.zx.order.bean.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Title: OrderMapper
 * Description: OrderMapper
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/7/9 15:22
 */
@Mapper
public interface OrderMapper {

    /**
     * 插入
     * @param order order
     */
    void insertOrder(Order order);

    /**
     * 通过id删除
     * @param id id
     */
    void deleteOrderById(String id);

    /**
     * 更新
     * @param order order
     */
    void updateOrderById(Order order);

    /**
     * 通过id查询
     * @param id id
     * @return order
     */
    Order selectOrderById(String id);

    /**
     * 通过userId查询
     * @param userId userId
     * @return orderList
     */
    List<Order> selectOrderByUserId(String userId);
}
