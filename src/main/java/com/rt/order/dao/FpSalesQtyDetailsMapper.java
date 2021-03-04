package com.rt.order.dao;

import com.rt.order.entity.FpSalesQtyDetails;

public interface FpSalesQtyDetailsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FpSalesQtyDetails record);

    int insertSelective(FpSalesQtyDetails record);

    FpSalesQtyDetails selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FpSalesQtyDetails record);

    int updateByPrimaryKey(FpSalesQtyDetails record);
}