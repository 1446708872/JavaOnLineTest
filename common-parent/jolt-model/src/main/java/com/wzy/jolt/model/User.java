package com.wzy.jolt.model;

public class User {
    private Integer userId;

    private String password;

    private Integer userClass;

    private Integer powerTitle;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getUserClass() {
        return userClass;
    }

    public void setUserClass(Integer userClass) {
        this.userClass = userClass;
    }

    public Integer getPowerTitle() {
        return powerTitle;
    }

    public void setPowerTitle(Integer powerTitle) {
        this.powerTitle = powerTitle;
    }
}