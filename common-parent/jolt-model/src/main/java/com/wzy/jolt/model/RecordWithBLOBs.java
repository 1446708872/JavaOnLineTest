package com.wzy.jolt.model;

public class RecordWithBLOBs extends Record {
    private String done;

    private String answer;

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done == null ? null : done.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}