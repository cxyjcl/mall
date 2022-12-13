package org.cool.coupon.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class SeckillPromotion {
    private Long id;

    private String title;

    private Date startTime;

    private Date endTime;

    private Byte state;

    private Date createTime;

    private Long userId;

}