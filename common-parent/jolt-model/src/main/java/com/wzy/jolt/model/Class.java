package com.wzy.jolt.model;

public class Class {
    private Integer classUser;

    private String classAge;

    private String classMajor;

    public Integer getClassUser() {
        return classUser;
    }

    public void setClassUser(Integer classUser) {
        this.classUser = classUser;
    }

    public String getClassAge() {
        return classAge;
    }

    public void setClassAge(String classAge) {
        this.classAge = classAge == null ? null : classAge.trim();
    }

    public String getClassMajor() {
        return classMajor;
    }

    public void setClassMajor(String classMajor) {
        this.classMajor = classMajor == null ? null : classMajor.trim();
    }
}