package com.zx.order.service.impl;

import com.zx.order.bean.Commodity;
import com.zx.order.mapper.CommodityMapper;
import com.zx.order.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Title: CommodityServiceImpl
 * Description: CommodityServiceImpl
 * Copyright: Copyright (c) 2007
 * Company 北京华宇信息技术有限公司
 *
 * @author zhengxin-3@thunisoft.com
 * @version 1.0
 * date 2020/7/9 18:11
 */
@Service
public class CommodityServiceImpl implements ICommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    /**
     * 插入
     *
     * @param commodity commodity
     */
    @Override
    public void insertCommodity(Commodity commodity) {
        commodityMapper.insertCommodity(commodity);
    }

    /**
     * 通过id删除
     *
     * @param id id
     */
    @Override
    public void deleteCommodityById(String id) {
        commodityMapper.deleteCommodityById(id);
    }

    /**
     * 通过id修改
     *
     * @param commodity commodity
     */
    @Override
    public void updateCommodityById(Commodity commodity) {
        commodityMapper.updateCommodityById(commodity);
    }

    /**
     * 通过id查询
     *
     * @param id id
     * @return
     */
    @Override
    public Commodity selectCommodityByid(String id) {
        return commodityMapper.selectCommodityByid(id);
    }

    /**
     * 查询所有
     *
     * @return commodityList
     */
    @Override
    public List<Commodity> selectAllCommodity() {
        return commodityMapper.selectAllCommodity();
    }
}
