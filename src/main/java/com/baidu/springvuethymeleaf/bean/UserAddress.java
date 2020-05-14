package com.baidu.springvuethymeleaf.bean;

import java.io.Serializable;

public class UserAddress implements Serializable {

    private Integer id;
    private String address;
    private String userId;

    public UserAddress() {
    }

    public UserAddress(Integer id, String address, String userId) {
        this.id = id;
        this.address = address;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}