package com.zx.client.service.impl;

import com.zx.client.bean.Product;
import com.zx.client.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Title: ProductServiceImpl
 * Description: ProductServiceImpl
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/6/10 10:38
 */
@Service
public class ProductServiceImpl implements IProductService {

    private static final Map<Integer, Product> DAO_MAP = new HashMap<>();

    static {
        Product p1 = new Product(1,"iphonex",9999, 10);
        Product p2 = new Product(2,"冰箱",5342, 19);
        Product p3 = new Product(3,"洗衣机",523, 90);
        Product p4 = new Product(4,"电话",64345, 150);
        Product p5 = new Product(5,"汽车",2345, 140);
        Product p6 = new Product(6,"椅子",253, 20);
        Product p7 = new Product(7,"java编程思想",2341, 10);

        DAO_MAP.put(p1.getId(),p1);
        DAO_MAP.put(p2.getId(),p2);
        DAO_MAP.put(p3.getId(),p3);
        DAO_MAP.put(p4.getId(),p4);
        DAO_MAP.put(p5.getId(),p5);
        DAO_MAP.put(p6.getId(),p6);
        DAO_MAP.put(p7.getId(),p7);
    }
    /**
     * 查询商品列表
     *
     * @return 商品
     */
    @Override
    public List<Product> listProduct() {
        Collection<Product> collection = DAO_MAP.values();
        List<Product> list = new ArrayList<>(collection);
        return list;
    }

    /**
     * 通过id查询
     *
     * @param id id
     * @return 商品
     */
    @Override
    public Product findById(int id) {
        return DAO_MAP.get(id);
    }
}
