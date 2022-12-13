package org.cool.coupon.dao;

import org.cool.coupon.pojo.MemberPrice;

public interface MemberPriceDao {

    int deleteById(Long id);

    int insert(MemberPrice row);

    MemberPrice selectById(Long id);

}