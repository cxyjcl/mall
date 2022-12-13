package org.cool.coupon.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SkuLadder {
    private Long id;

    private Long skuId;

    private Integer fullCount;

    private BigDecimal discount;

    private BigDecimal price;

    private Boolean addOther;

}