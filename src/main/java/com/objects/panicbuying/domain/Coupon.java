package com.objects.panicbuying.domain;

import java.util.Date;

public class Coupon {

    private Long id;

    private String name;

    private String price; // String? column에 varchar

    private Long productId;

    private Integer count;

    private Integer minimumPrice;

    private Date startDate;

    private Date endDate;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
