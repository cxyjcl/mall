package org.cool.coupon.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Coupon {
    private Long id;

    private Boolean couponType;

    private String couponImg;

    private String couponName;

    private Integer num;

    private BigDecimal amount;

    private Integer perLimit;

    private BigDecimal minPoint;

    private Date startTime;

    private Date endTime;

    private Boolean useType;

    private String note;

    private Integer publishCount;

    private Integer useCount;

    private Integer receiveCount;

    private Date enableStartTime;

    private Date enableEndTime;

    private String code;

    private Boolean memberLevel;

    private Boolean publish;

}