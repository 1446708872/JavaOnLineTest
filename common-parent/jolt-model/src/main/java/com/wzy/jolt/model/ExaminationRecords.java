package com.wzy.jolt.model;

public class ExaminationRecords {
    private Integer examination_id;

    private Integer user_id;

    private String choice;

    private String choice_done;

    private String completion;

    private String completion_done;

    private Integer score;

    private Integer problem_id;

    private String timer;

    public Integer getProblem_id() {
        return problem_id;
    }

    public void setProblem_id(Integer problem_id) {
        this.problem_id = problem_id;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public Integer getExamination_id() {
        return examination_id;
    }

    public void setExamination_id(Integer examination_id) {
        this.examination_id = examination_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getChoice_done() {
        return choice_done;
    }

    public void setChoice_done(String choice_done) {
        this.choice_done = choice_done;
    }

    public String getCompletion() {
        return completion;
    }

    public void setCompletion(String completion) {
        this.completion = completion;
    }

    public String getCompletion_done() {
        return completion_done;
    }

    public void setCompletion_done(String completion_done) {
        this.completion_done = completion_done;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}