package org.cool.coupon.dao;

import org.cool.coupon.pojo.SpuBound;

public interface SpuBoundDao {

    int deleteById(Long id);

    int insert(SpuBound row);

    SpuBound selectById(Long id);

}