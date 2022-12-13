package org.cool.ware.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class WareOrderTask {
    private Long id;

    private Long orderId;

    private String orderSn;

    private String consignee;

    private String consigneeTel;

    private String deliveryAddress;

    private String orderComment;

    private Boolean paymentWay;

    private Byte taskState;

    private String orderBody;

    private String trackingNo;

    private Date createTime;

    private Long wareId;

    private String taskComment;

}