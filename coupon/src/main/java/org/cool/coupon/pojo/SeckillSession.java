package org.cool.coupon.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class SeckillSession {
    private Long id;

    private String name;

    private Date startTime;

    private Date endTime;

    private Boolean state;

    private Date createTime;


}