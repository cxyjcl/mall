package org.cool.coupon.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MemberPrice {
    private Long id;

    private Long skuId;

    private Long memberLevelId;

    private String memberLevelName;

    private BigDecimal memberPrice;

    private Boolean addOther;

}