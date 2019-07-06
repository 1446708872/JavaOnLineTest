package com.wzy.jolt.model;

public class Title {
    private Integer id;

    private Integer title_power;

    private String title;

    private String title_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTitle_power() {
        return title_power;
    }

    public void setTitle_power(Integer title_power) {
        this.title_power = title_power;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_id() {
        return title_id;
    }

    public void setTitle_id(String title_id) {
        this.title_id = title_id;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", title_power=" + title_power +
                ", title='" + title + '\'' +
                ", title_id='" + title_id + '\'' +
                '}';
    }
}