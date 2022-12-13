package org.cool.coupon.pojo;

import lombok.Data;

@Data
public class CouponSpuRelation {
    private Long id;

    private Long couponId;

    private Long spuId;

    private String spuName;

}