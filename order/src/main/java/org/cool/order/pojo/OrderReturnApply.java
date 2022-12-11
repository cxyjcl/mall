package org.cool.order.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderReturnApply {
    private Long id;

    private Long orderId;

    private Long skuId;

    private String orderSn;

    private Date createTime;

    private String memberUsername;

    private BigDecimal returnAmount;

    private String returnName;

    private String returnPhone;

    private Boolean status;

    private Date handleTime;

    private String skuImg;

    private String skuName;

    private String skuBrand;

    private String skuAttrsVals;

    private Integer skuCount;

    private BigDecimal skuPrice;

    private BigDecimal skuRealPrice;

    private String reason;

    private String description;

    private String descPics;

    private String handleNote;

    private String handleMan;

    private String receiveMan;

    private Date receiveTime;

    private String receiveNote;

    private String receivePhone;

    private String companyAddress;

}