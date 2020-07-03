package com.zx.client.controller;

import com.zx.client.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: ProductController
 * Description: ProductController
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/6/10 10:33
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    /**
     * 获取所有商品列表
     *
     * @return
     */
    @GetMapping("list")
    public Object list() {
        return productService.listProduct();
    }

    /**
     * 根据id查找商品详情
     *
     * @param id
     * @return
     */
    @GetMapping("find")
    public Object findById(@RequestParam("id") int id) {
        return productService.findById(id);
    }
}
