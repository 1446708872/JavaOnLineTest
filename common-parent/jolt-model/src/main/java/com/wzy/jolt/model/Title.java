package com.wzy.jolt.model;

public class Title {
    private Integer titlePower;

    private String title;

    private String titleId;

    public Integer getTitlePower() {
        return titlePower;
    }

    public void setTitlePower(Integer titlePower) {
        this.titlePower = titlePower;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId == null ? null : titleId.trim();
    }
}