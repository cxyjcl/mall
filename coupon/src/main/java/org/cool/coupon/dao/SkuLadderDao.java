package org.cool.coupon.dao;

import org.cool.coupon.pojo.SkuLadder;

public interface SkuLadderDao {

    int deleteById(Long id);

    int insert(SkuLadder row);

    SkuLadder selectById(Long id);

}