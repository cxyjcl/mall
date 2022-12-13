package org.cool.coupon.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SeckillFullReduction {
    private Long id;

    private Long skuId;

    private BigDecimal fullPrice;

    private BigDecimal reducePrice;

    private Boolean addOther;

}