package org.cool.member.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class MemberCollectSpu {
    private Long id;

    private Long memberId;

    private Long spuId;

    private String spuName;

    private String spuImg;

    private Date createTime;

}