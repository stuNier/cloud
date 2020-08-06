package com.zx.order.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * Title: Order
 * Description: order
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/7/3 16:14
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    /** id */
    private String id;

    /** userId */
    private String userId;

    /** 商品id*/
    private String commodityId;

    /** 数量 */
    private int number;

    /** 总额 */
    private double totalPrice;

    /** 状态 */
    private String status;

    /** 创建时间 */
    private Date createdTime;

    /** 更新时间 */
    private Date updateTime;
}
