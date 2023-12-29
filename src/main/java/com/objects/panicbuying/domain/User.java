package com.objects.panicbuying.domain;

import java.util.Date;

public class User {

    private Long id;

    private UserType userType;

    private SocialType socialType;

    private Membership membership;

    private String email;

    private String password;

    private String name;

    private String phoneNo;

    private String birth;

    private boolean isAlert;

    private boolean isAgree;

    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
