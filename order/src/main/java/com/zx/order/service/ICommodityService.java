package com.zx.order.service;

import com.zx.order.bean.Commodity;

import java.util.List;

/**
 * Title: ICommodityService
 * Description: ICommodityService
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/7/9 18:09
 */
public interface ICommodityService {

    /**
     * 插入
     * @param commodity commodity
     */
    void insertCommodity(Commodity commodity);

    /**
     * 通过id删除
     * @param id id
     */
    void deleteCommodityById(String id);

    /**
     * 通过id修改
     * @param commodity commodity
     */
    void updateCommodityById(Commodity commodity);

    /**
     * 通过id查询
     * @param id id
     * @return
     */
    Commodity selectCommodityByid(String id);

    /**
     * 查询所有
     * @return commodityList
     */
    List<Commodity> selectAllCommodity();
}
