package org.cool.order.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {
    private Long id;

    private Long memberId;

    private String orderSn;

    private Long couponId;

    private String memberUsername;

    private BigDecimal totalAmount;

    private BigDecimal payAmount;

    private BigDecimal freightAmount;

    private BigDecimal promotionAmount;

    private BigDecimal integrationAmount;

    private BigDecimal couponAmount;

    private BigDecimal discountAmount;

    private Byte payType;

    private Byte sourceType;

    private Byte status;

    private String deliveryCompany;

    private String deliverySn;

    private Integer autoConfirmDay;

    private Integer integration;

    private Integer growth;

    private Byte billType;

    private String billHeader;

    private String billContent;

    private String billReceiverPhone;

    private String billReceiverEmail;

    private String receiverName;

    private String receiverPhone;

    private String receiverPostCode;

    private String receiverProvince;

    private String receiverCity;

    private String receiverRegion;

    private String receiverDetailAddress;

    private String note;

    private Byte confirmStatus;

    private Byte deleteStatus;

    private Integer useIntegration;

    private Date paymentTime;

    private Date deliveryTime;

    private Date receiveTime;

    private Date createTime;

    private Date modifyTime;

}