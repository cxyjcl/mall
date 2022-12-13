package org.cool.coupon.pojo;

import lombok.Data;

@Data
public class CouponSpuCategoryRelation {
    private Long id;

    private Long couponId;

    private Long categoryId;

    private String categoryName;

}