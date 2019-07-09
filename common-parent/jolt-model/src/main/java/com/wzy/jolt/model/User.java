package com.wzy.jolt.model;

public class User {
    private Integer id;

    private Integer user_id;

    private String password;

    private Integer user_class;

    private Integer power_title;

    private String name;

    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUser_class() {
        return user_class;
    }

    public void setUser_class(Integer user_class) {
        this.user_class = user_class;
    }

    public Integer getPower_title() {
        return power_title;
    }

    public void setPower_title(Integer power_title) {
        this.power_title = power_title;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", password='" + password + '\'' +
                ", user_class=" + user_class +
                ", power_title=" + power_title +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}