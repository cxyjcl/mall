package org.cool.member.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class GrowthChangeHistory {
    private Long id;

    private Long memberId;

    private Date createTime;

    private Integer changeCount;

    private String note;

    private Byte sourceType;

}