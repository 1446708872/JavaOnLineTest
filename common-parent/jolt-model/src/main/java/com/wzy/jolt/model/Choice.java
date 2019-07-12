package com.wzy.jolt.model;

import javax.xml.crypto.Data;

public class Choice {
    private Integer choice_id;

    private Integer problem_id;

    private String introduce;

    private String a;

    private String b;

    private String c;

    private String d;

    private String answer;

    private String timer;

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public Integer getChoice_id() {
        return choice_id;
    }

    public void setChoice_id(Integer choice_id) {
        this.choice_id = choice_id;
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

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "choice_id=" + choice_id +
                ", problem_id=" + problem_id +
                ", introduce='" + introduce + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}