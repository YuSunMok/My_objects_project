package com.objects.panicbuying.domain;

import java.util.Date;

public class Product {

    private Long id;

    private Long categoryId;

    private boolean isOwn; // 로켓 true , 오픈 마켓 false

    private String name;

    private Integer price;

    private boolean isSubs;

    private String thumbImg;

    private Integer discountRate;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
