package org.cool.order.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RefundInfo {
    private Long id;

    private Long orderReturnId;

    private BigDecimal refund;

    private String refundSn;

    private Boolean refundStatus;

    private Byte refundChannel;

    private String refundContent;

}