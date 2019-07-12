package com.wzy.jolt.model;

import javax.xml.crypto.Data;

public class Completion {
    private Integer completion_id;

    private Integer problem_id;

    private String introduce;

    private String subject;

    private String answer;

    private Integer score;

    private Data timer;


    @Override
    public String toString() {
        return "Completion{" +
                "completion_id=" + completion_id +
                ", problem_id=" + problem_id +
                ", introduce='" + introduce + '\'' +
                ", subject='" + subject + '\'' +
                ", answer='" + answer + '\'' +
                ", score=" + score +
                '}';
    }

    public Data getTimer() {
        return timer;
    }

    public void setTimer(Data timer) {
        this.timer = timer;
    }


    public Integer getCompletion_id() {
        return completion_id;
    }

    public void setCompletion_id(Integer completion_id) {
        this.completion_id = completion_id;
    }

    public Integer getProblem_id() {
        return problem_id;
    }

    public void setProblem_id(Integer problem_id) {
        this.problem_id = problem_id;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}