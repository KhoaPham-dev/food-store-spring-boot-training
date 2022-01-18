package com.landingis.api.constant;


import com.landingis.api.utils.ConfigurationService;

public class LandingISConstant {
    public static final String ROOT_DIRECTORY =  ConfigurationService.getInstance().getString("file.upload-dir","/tmp/upload");

    public static final Integer USER_KIND_ADMIN = 1;
    public static final Integer USER_KIND_CUSTOMER = 2;
    public static final Integer USER_KIND_EMPLOYEE = 3;
    public static final Integer USER_KIND_COLLABORATOR = 4;

    public static final Integer STATUS_ACTIVE = 1;
    public static final Integer STATUS_PENDING = 0;
    public static final Integer STATUS_LOCK = -1;
    public static final Integer STATUS_DELETE = -2;

    public static final Integer GROUP_KIND_SUPER_ADMIN = 1;
    public static final Integer GROUP_KIND_CUSTOMER = 2;
    public static final Integer GROUP_KIND_EMPLOYEE = 3;
    public static final Integer GROUP_KIND_COLLABORATOR = 4;

    public static final Integer MAX_ATTEMPT_FORGET_PWD = 5;
    public static final Integer MAX_TIME_FORGET_PWD = 5 * 60 * 1000; //5 minutes
    public static final Integer MAX_ATTEMPT_LOGIN = 5;
    public static final Integer MAX_TIME_VERIFY_ACCOUNT = 5 * 60 * 1000; //5 minutes

    public static final Integer MIN_OF_PERCENT = 0;
    public static final Integer MAX_OF_PERCENT = 100;

    public static final Integer MIN_PRICE = 0;

    public static final Integer CATEGORY_KIND = 1;

    public static final Integer COLLABORATOR_KIND_PERCENT = 1;
    public static final Integer COLLABORATOR_KIND_DOLLAR = 2;


    public static final Integer GENDER_MALE = 1;
    public static final Integer GENDER_FEMALE = 2;
    public static final Integer GENDER_OTHER = 3;

    public static final Integer PROVINCE_KIND_COMMUNE = 1;
    public static final Integer PROVINCE_KIND_DISTRICT = 2;
    public static final Integer PROVINCE_KIND_PROVINCE = 3;


    private LandingISConstant(){
        throw new IllegalStateException("Utility class");
    }

}
