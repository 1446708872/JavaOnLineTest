package com.wzy.jolt.model;

public class Completion {
    private Integer completion_id;

    private Integer problem_id;

    private String introduce;

    private String answer;

    private Integer score;

    @Override
    public String toString() {
        return "Completion{" +
                "completion_id=" + completion_id +
                ", problem_id=" + problem_id +
                ", introduce='" + introduce + '\'' +
                ", answer='" + answer + '\'' +
                ", score=" + score +
                '}';
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