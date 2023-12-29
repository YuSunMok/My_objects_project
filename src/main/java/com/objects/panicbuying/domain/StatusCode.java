package com.objects.panicbuying.domain;

import java.util.Date;

public class StatusCode {

    private Long id;

    private StockCodeType stockCodeType; // ORDER, DELIVERY, ORD_EXCHANGE, CANCEL, PAYMENT, ORD_RETURN, ERROR

    private String code;

    private String name;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
