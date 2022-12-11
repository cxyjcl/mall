package org.cool.order.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PaymentInfo {
    private Long id;

    private String orderSn;

    private Long orderId;

    private String tradeNo;

    private Byte payType;

    private BigDecimal totalAmount;

    private String subject;

    private String paymentStatus;

    private Date createTime;

    private Date confirmTime;

    private String callbackContent;

    private Date callbackTime;

}