package com.wzy.jolt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
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

        public Criteria andExercisesIdIsNull() {
            addCriterion("exercises_id is null");
            return (Criteria) this;
        }

        public Criteria andExercisesIdIsNotNull() {
            addCriterion("exercises_id is not null");
            return (Criteria) this;
        }

        public Criteria andExercisesIdEqualTo(Integer value) {
            addCriterion("exercises_id =", value, "exercisesId");
            return (Criteria) this;
        }

        public Criteria andExercisesIdNotEqualTo(Integer value) {
            addCriterion("exercises_id <>", value, "exercisesId");
            return (Criteria) this;
        }

        public Criteria andExercisesIdGreaterThan(Integer value) {
            addCriterion("exercises_id >", value, "exercisesId");
            return (Criteria) this;
        }

        public Criteria andExercisesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exercises_id >=", value, "exercisesId");
            return (Criteria) this;
        }

        public Criteria andExercisesIdLessThan(Integer value) {
            addCriterion("exercises_id <", value, "exercisesId");
            return (Criteria) this;
        }

        public Criteria andExercisesIdLessThanOrEqualTo(Integer value) {
            addCriterion("exercises_id <=", value, "exercisesId");
            return (Criteria) this;
        }

        public Criteria andExercisesIdIn(List<Integer> values) {
            addCriterion("exercises_id in", values, "exercisesId");
            return (Criteria) this;
        }

        public Criteria andExercisesIdNotIn(List<Integer> values) {
            addCriterion("exercises_id not in", values, "exercisesId");
            return (Criteria) this;
        }

        public Criteria andExercisesIdBetween(Integer value1, Integer value2) {
            addCriterion("exercises_id between", value1, value2, "exercisesId");
            return (Criteria) this;
        }

        public Criteria andExercisesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exercises_id not between", value1, value2, "exercisesId");
            return (Criteria) this;
        }

        public Criteria andSubtimeIsNull() {
            addCriterion("subtime is null");
            return (Criteria) this;
        }

        public Criteria andSubtimeIsNotNull() {
            addCriterion("subtime is not null");
            return (Criteria) this;
        }

        public Criteria andSubtimeEqualTo(Date value) {
            addCriterion("subtime =", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeNotEqualTo(Date value) {
            addCriterion("subtime <>", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeGreaterThan(Date value) {
            addCriterion("subtime >", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("subtime >=", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeLessThan(Date value) {
            addCriterion("subtime <", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeLessThanOrEqualTo(Date value) {
            addCriterion("subtime <=", value, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeIn(List<Date> values) {
            addCriterion("subtime in", values, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeNotIn(List<Date> values) {
            addCriterion("subtime not in", values, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeBetween(Date value1, Date value2) {
            addCriterion("subtime between", value1, value2, "subtime");
            return (Criteria) this;
        }

        public Criteria andSubtimeNotBetween(Date value1, Date value2) {
            addCriterion("subtime not between", value1, value2, "subtime");
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