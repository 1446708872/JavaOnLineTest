package com.wzy.jolt.model;

public class Class {
    private Integer class_user;

    private String class_age;

    private String class_major;

    @Override
    public String toString() {
        return "Class{" +
                "class_user=" + class_user +
                ", class_age='" + class_age + '\'' +
                ", class_major='" + class_major + '\'' +
                '}';
    }

    public Integer getClass_user() {
        return class_user;
    }

    public void setClass_user(Integer class_user) {
        this.class_user = class_user;
    }

    public String getClass_age() {
        return class_age;
    }

    public void setClass_age(String class_age) {
        this.class_age = class_age;
    }

    public String getClass_major() {
        return class_major;
    }

    public void setClass_major(String class_major) {
        this.class_major = class_major;
    }
}