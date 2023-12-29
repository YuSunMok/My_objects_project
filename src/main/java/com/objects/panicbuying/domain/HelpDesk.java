package com.objects.panicbuying.domain;

import java.util.Date;

public class HelpDesk {

    private Long id;

    private Long orderId;

    private Long userId;

    private Long productId;

    private ContentsType contentsType; // 내용추가 or ContentType과 다른거?

    private String content;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

}
