package com.zx.order.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Title: Goods
 * Description: Commodity
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/7/9 14:55
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Commodity {

    /** id */
    private String id;

    /** 名称*/
    private String name;

    /** 描述 */
    private String address;

    /** 价格 */
    private double price;

    /** 库存 */
    private int stock;

    /** 状态 */
    private String status;

    /** 创建时间 */
    private Date createdTime;

    /** 更新时间 */
    private Date updateTime;

}
