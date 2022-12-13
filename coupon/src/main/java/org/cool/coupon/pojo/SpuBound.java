package org.cool.coupon.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SpuBound {
    private Long id;

    private Long spuId;

    private BigDecimal growBounds;

    private BigDecimal buyBounds;

    private Boolean work;

}