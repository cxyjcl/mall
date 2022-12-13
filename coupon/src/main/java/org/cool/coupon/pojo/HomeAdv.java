package org.cool.coupon.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class HomeAdv {
    private Long id;

    private String name;

    private String pic;

    private Date startTime;

    private Date endTime;

    private Boolean state;

    private Integer clickCount;

    private String url;

    private String note;

    private Integer sort;

    private Long publisherId;

    private Long authId;

}