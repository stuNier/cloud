package com.zx.client.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Title: Product
 * Description: Product
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/6/10 10:35
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    /** id */
    private int id;

    /** 商品名称 */
    private String name;

    /** 价格,分为单位 */
    private int price;

    /** 库存 */
    private int store;
}
