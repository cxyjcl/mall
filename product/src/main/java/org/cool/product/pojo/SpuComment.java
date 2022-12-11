package org.cool.product.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class SpuComment {
    private Long id;

    private Long skuId;

    private Long spuId;

    private String spuName;

    private String memberNickName;

    private Boolean star;

    private String memberIp;

    private Date createTime;

    private Boolean showStatus;

    private Integer likesCount;

    private Integer replyCount;

    private String memberIcon;

    private Long replyId;

    private String content;

}