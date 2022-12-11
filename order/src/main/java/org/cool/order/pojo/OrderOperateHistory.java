package org.cool.order.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class OrderOperateHistory {
    private Long id;

    private Long orderId;

    private String operateMan;

    private Date createTime;

    private Byte orderStatus;

    private String note;

}