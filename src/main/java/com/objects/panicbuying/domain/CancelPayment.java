package com.objects.panicbuying.domain;

import java.util.Date;

public class CancelPayment {

    private Long id;

    private Long orderId;

    private CancelPaymentStatus cancelPaymentStatus; // 내용추가 , column명 다름

    private Date cancelDate;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

}
