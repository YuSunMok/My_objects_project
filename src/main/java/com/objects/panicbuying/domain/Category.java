package com.objects.panicbuying.domain;

import java.util.Date;

public class Category {

    private Long id;

    private Long parentId; // erd parent로 변경

    private Long childId;

    private String name;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
