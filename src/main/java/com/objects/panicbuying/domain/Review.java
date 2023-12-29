package com.objects.panicbuying.domain;

import java.util.Date;

public class Review {

    private Long id;

    private Long orderId;

    private Long productId;

    private String content;

    private int rating; //1-5

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

}
