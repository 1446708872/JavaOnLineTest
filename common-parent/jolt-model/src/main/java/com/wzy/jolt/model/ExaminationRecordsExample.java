package com.wzy.jolt.model;

import java.util.ArrayList;
import java.util.List;

public class ExaminationRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExaminationRecordsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andExaminationIdIsNull() {
            addCriterion("examination_id is null");
            return (Criteria) this;
        }

        public Criteria andExaminationIdIsNotNull() {
            addCriterion("examination_id is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationIdEqualTo(Integer value) {
            addCriterion("examination_id =", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotEqualTo(Integer value) {
            addCriterion("examination_id <>", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdGreaterThan(Integer value) {
            addCriterion("examination_id >", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("examination_id >=", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdLessThan(Integer value) {
            addCriterion("examination_id <", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdLessThanOrEqualTo(Integer value) {
            addCriterion("examination_id <=", value, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdIn(List<Integer> values) {
            addCriterion("examination_id in", values, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotIn(List<Integer> values) {
            addCriterion("examination_id not in", values, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdBetween(Integer value1, Integer value2) {
            addCriterion("examination_id between", value1, value2, "examinationId");
            return (Criteria) this;
        }

        public Criteria andExaminationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("examination_id not between", value1, value2, "examinationId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andChoiceIsNull() {
            addCriterion("choice is null");
            return (Criteria) this;
        }

        public Criteria andChoiceIsNotNull() {
            addCriterion("choice is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceEqualTo(String value) {
            addCriterion("choice =", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotEqualTo(String value) {
            addCriterion("choice <>", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceGreaterThan(String value) {
            addCriterion("choice >", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceGreaterThanOrEqualTo(String value) {
            addCriterion("choice >=", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceLessThan(String value) {
            addCriterion("choice <", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceLessThanOrEqualTo(String value) {
            addCriterion("choice <=", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceLike(String value) {
            addCriterion("choice like", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotLike(String value) {
            addCriterion("choice not like", value, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceIn(List<String> values) {
            addCriterion("choice in", values, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotIn(List<String> values) {
            addCriterion("choice not in", values, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceBetween(String value1, String value2) {
            addCriterion("choice between", value1, value2, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceNotBetween(String value1, String value2) {
            addCriterion("choice not between", value1, value2, "choice");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneIsNull() {
            addCriterion("choice_done is null");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneIsNotNull() {
            addCriterion("choice_done is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneEqualTo(String value) {
            addCriterion("choice_done =", value, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneNotEqualTo(String value) {
            addCriterion("choice_done <>", value, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneGreaterThan(String value) {
            addCriterion("choice_done >", value, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneGreaterThanOrEqualTo(String value) {
            addCriterion("choice_done >=", value, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneLessThan(String value) {
            addCriterion("choice_done <", value, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneLessThanOrEqualTo(String value) {
            addCriterion("choice_done <=", value, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneLike(String value) {
            addCriterion("choice_done like", value, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneNotLike(String value) {
            addCriterion("choice_done not like", value, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneIn(List<String> values) {
            addCriterion("choice_done in", values, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneNotIn(List<String> values) {
            addCriterion("choice_done not in", values, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneBetween(String value1, String value2) {
            addCriterion("choice_done between", value1, value2, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andChoiceDoneNotBetween(String value1, String value2) {
            addCriterion("choice_done not between", value1, value2, "choiceDone");
            return (Criteria) this;
        }

        public Criteria andCompletionIsNull() {
            addCriterion("completion is null");
            return (Criteria) this;
        }

        public Criteria andCompletionIsNotNull() {
            addCriterion("completion is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionEqualTo(String value) {
            addCriterion("completion =", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotEqualTo(String value) {
            addCriterion("completion <>", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionGreaterThan(String value) {
            addCriterion("completion >", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionGreaterThanOrEqualTo(String value) {
            addCriterion("completion >=", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionLessThan(String value) {
            addCriterion("completion <", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionLessThanOrEqualTo(String value) {
            addCriterion("completion <=", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionLike(String value) {
            addCriterion("completion like", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotLike(String value) {
            addCriterion("completion not like", value, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionIn(List<String> values) {
            addCriterion("completion in", values, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotIn(List<String> values) {
            addCriterion("completion not in", values, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionBetween(String value1, String value2) {
            addCriterion("completion between", value1, value2, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionNotBetween(String value1, String value2) {
            addCriterion("completion not between", value1, value2, "completion");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneIsNull() {
            addCriterion("completion_done is null");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneIsNotNull() {
            addCriterion("completion_done is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneEqualTo(String value) {
            addCriterion("completion_done =", value, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneNotEqualTo(String value) {
            addCriterion("completion_done <>", value, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneGreaterThan(String value) {
            addCriterion("completion_done >", value, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneGreaterThanOrEqualTo(String value) {
            addCriterion("completion_done >=", value, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneLessThan(String value) {
            addCriterion("completion_done <", value, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneLessThanOrEqualTo(String value) {
            addCriterion("completion_done <=", value, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneLike(String value) {
            addCriterion("completion_done like", value, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneNotLike(String value) {
            addCriterion("completion_done not like", value, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneIn(List<String> values) {
            addCriterion("completion_done in", values, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneNotIn(List<String> values) {
            addCriterion("completion_done not in", values, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneBetween(String value1, String value2) {
            addCriterion("completion_done between", value1, value2, "completionDone");
            return (Criteria) this;
        }

        public Criteria andCompletionDoneNotBetween(String value1, String value2) {
            addCriterion("completion_done not between", value1, value2, "completionDone");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}