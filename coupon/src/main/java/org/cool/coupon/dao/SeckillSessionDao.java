package org.cool.coupon.dao;

import org.cool.coupon.pojo.SeckillSession;

public interface SeckillSessionDao {

    int deleteById(Long id);

    int insert(SeckillSession row);

    SeckillSession selectById(Long id);

}