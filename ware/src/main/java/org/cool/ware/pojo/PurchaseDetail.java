package org.cool.ware.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PurchaseDetail {
    private Long id;

    private Long purchaseId;

    private Long skuId;

    private Integer skuNum;

    private BigDecimal skuPrice;

    private Long wareId;

    private Integer state;

}