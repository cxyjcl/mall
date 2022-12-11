package org.cool.order.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItem {
    private Long id;

    private Long orderId;

    private String orderSn;

    private Long spuId;

    private String spuName;

    private String spuPic;

    private String spuBrand;

    private Long categoryId;

    private Long skuId;

    private String skuName;

    private String skuPic;

    private BigDecimal skuPrice;

    private Integer skuQuantity;

    private BigDecimal promotionAmount;

    private BigDecimal couponAmount;

    private BigDecimal integrationAmount;

    private BigDecimal realAmount;

    private Integer giftIntegration;

    private Integer giftGrowth;

}