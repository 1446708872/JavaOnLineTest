package com.wzy.jolt.model;

import java.util.List;

public class Ltmit {
    private Integer size;

    private Integer allSize;

    private List<Class> classes;

    private List<User> users;

    @Override
    public String toString() {
        return "Ltmit{" +
                "size=" + size +
                ", allSize=" + allSize +
                ", classes=" + classes +
                ", users=" + users +
                '}';
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getAllSize() {
        return allSize;
    }

    public void setAllSize(Integer allSize) {
        this.allSize = allSize;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
