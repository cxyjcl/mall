package org.cool.coupon.dao;

import org.cool.coupon.pojo.HomeAdv;

public interface HomeAdvDao {

    int deleteById(Long id);

    int insert(HomeAdv row);

    HomeAdv selectById(Long id);

}