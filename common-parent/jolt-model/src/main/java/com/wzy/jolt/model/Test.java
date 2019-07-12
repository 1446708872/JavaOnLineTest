package com.wzy.jolt.model;

import java.util.List;

public class Test {
    private Integer problem_id;

    private List<Choice> choiceList;

    private List<Completion> completionList;

    public Integer getProblem_id() {
        return problem_id;
    }

    public void setProblem_id(Integer problem_id) {
        this.problem_id = problem_id;
    }

    public List<Choice> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<Choice> choiceList) {
        this.choiceList = choiceList;
    }

    public List<Completion> getCompletionList() {
        return completionList;
    }

    public void setCompletionList(List<Completion> completionList) {
        this.completionList = completionList;
    }
}
