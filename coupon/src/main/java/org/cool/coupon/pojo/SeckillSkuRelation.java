package org.cool.coupon.pojo;

import lombok.Data;

@Data
public class SeckillSkuRelation {
    private Long id;

    private Long promotionId;

    private Long promotionSessionId;

    private Long skuId;

    private Long seckillPrice;

    private Long seckillCount;

    private Long seckillLimit;

    private Integer seckillSort;

}