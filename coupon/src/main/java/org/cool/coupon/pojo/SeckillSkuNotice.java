package org.cool.coupon.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class SeckillSkuNotice {
    private Long id;

    private Long memberId;

    private Long skuId;

    private Long sessionId;

    private Date subcribeTime;

    private Date sendTime;

    private Boolean noticeType;

}