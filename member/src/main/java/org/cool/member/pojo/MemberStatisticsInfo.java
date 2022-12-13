package org.cool.member.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MemberStatisticsInfo {
    private Long id;

    private Long memberId;

    private BigDecimal consumeAmount;

    private BigDecimal couponAmount;

    private Integer orderCount;

    private Integer couponCount;

    private Integer commentCount;

    private Integer returnOrderCount;

    private Integer loginCount;

    private Integer markCount;

    private Integer fansCount;

    private Integer collectProductCount;

    private Integer collectSubjectCount;

}