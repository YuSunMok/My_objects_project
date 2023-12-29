package com.objects.panicbuying.domain;

import java.util.Date;

public class ProdOrder {

    private Long id;

    private Long userId;

    private Long addressId;

    private String statusCode; // 00, DELIVERED, CANCEL, RETURN, EXCHANGE

    private Long totalPrice;

    private Long pointRate; // 적립율

    // 프론트 계산
    private Long savedPoint;

    private Date deliveredDate;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

}
