package com.wzy.jolt.model;

import java.util.Date;

public class Record {
    private Integer recordId;

    private Integer userId;

    private Integer exercisesId;

    private Date subtime;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExercisesId() {
        return exercisesId;
    }

    public void setExercisesId(Integer exercisesId) {
        this.exercisesId = exercisesId;
    }

    public Date getSubtime() {
        return subtime;
    }

    public void setSubtime(Date subtime) {
        this.subtime = subtime;
    }
}