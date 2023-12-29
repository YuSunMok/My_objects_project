package com.objects.panicbuying.domain;

import java.util.Date;

public class Payment {

    private Long id;

    private Long orderId;

    private String receiptId;

    private PayMethod payMethod; // CARD, CHECK, BANK, AUTO

    //카드번호, 계좌번호
    private String payNum;

    private String pg;

    //  status enum
    private PaymentStatus status; // 내용??

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

}
