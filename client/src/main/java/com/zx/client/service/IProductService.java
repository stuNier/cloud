package com.zx.client.service;

import com.zx.client.bean.Product;

import java.util.List;

/**
 * Title: IProductService
 * Description: IProductService
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/6/10 10:38
 */
public interface IProductService {

    /**
     * 查询商品列表
     * @return 商品
     */
    List<Product> listProduct();

    /**
     * 通过id查询
     * @param id id
     * @return 商品
     */
    Product findById(int id);
}
