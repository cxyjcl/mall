package org.cool.coupon.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class CouponHistory {
    private Long id;

    private Long couponId;

    private Long memberId;

    private String memberNickName;

    private Boolean getType;

    private Date createTime;

    private Boolean useState;

    private Date useTime;

    private Long orderId;

    private Long orderSn;

}