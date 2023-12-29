package com.objects.panicbuying.domain;

import java.util.Date;

public class Delivery {

    private Long id;

    private DeliveryType deliveryType; // NORMAL, EXCHANGE, RETURN // column이름이랑 다름

    private Long sellerId;

    private Long addressId;

    private Long orderDetailId;

    private String carrier;

    private String trackingNo;

    private String status;

    private Date shipDate;

    private Date deliveredDate;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

}
