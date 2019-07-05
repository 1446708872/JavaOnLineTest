package com.wzy.jolt.model;

public class ExaminationRecords {
    private Integer examinationId;

    private Integer userId;

    private String choice;

    private String choiceDone;

    private String completion;

    private String completionDone;

    private Integer score;

    public Integer getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(Integer examinationId) {
        this.examinationId = examinationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice == null ? null : choice.trim();
    }

    public String getChoiceDone() {
        return choiceDone;
    }

    public void setChoiceDone(String choiceDone) {
        this.choiceDone = choiceDone == null ? null : choiceDone.trim();
    }

    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion == null ? null : completion.trim();
    }

    public String getCompletionDone() {
        return completionDone;
    }

    public void setCompletionDone(String completionDone) {
        this.completionDone = completionDone == null ? null : completionDone.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}