package com.zx.order.controller;

import com.zx.order.bean.Commodity;
import com.zx.order.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Title: CommodityController
 * Description: CommodityController
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/7/9 17:55
 */
@RestController
@RequestMapping("/commodity")
public class CommodityController {

    /** commodityService */
    @Autowired
    private ICommodityService commodityService;

    /**
     * 通过id查询
     * @return 结果
     */
    @GetMapping("/query/id/{id}")
    public Object queryCommodityById(@PathVariable("id") String id){
        return commodityService.selectCommodityByid(id);
    }

    /**
     * 新增commodity
     * @param commodity commodity
     * @return 成功
     */
    @PostMapping("/add")
    public Object addCommodity(@RequestBody Commodity commodity){
        commodityService.insertCommodity(commodity);
        return "插入成功";
    }

}
