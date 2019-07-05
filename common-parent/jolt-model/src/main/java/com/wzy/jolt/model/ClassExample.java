package com.wzy.jolt.model;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andClassUserIsNull() {
            addCriterion("class_user is null");
            return (Criteria) this;
        }

        public Criteria andClassUserIsNotNull() {
            addCriterion("class_user is not null");
            return (Criteria) this;
        }

        public Criteria andClassUserEqualTo(Integer value) {
            addCriterion("class_user =", value, "classUser");
            return (Criteria) this;
        }

        public Criteria andClassUserNotEqualTo(Integer value) {
            addCriterion("class_user <>", value, "classUser");
            return (Criteria) this;
        }

        public Criteria andClassUserGreaterThan(Integer value) {
            addCriterion("class_user >", value, "classUser");
            return (Criteria) this;
        }

        public Criteria andClassUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_user >=", value, "classUser");
            return (Criteria) this;
        }

        public Criteria andClassUserLessThan(Integer value) {
            addCriterion("class_user <", value, "classUser");
            return (Criteria) this;
        }

        public Criteria andClassUserLessThanOrEqualTo(Integer value) {
            addCriterion("class_user <=", value, "classUser");
            return (Criteria) this;
        }

        public Criteria andClassUserIn(List<Integer> values) {
            addCriterion("class_user in", values, "classUser");
            return (Criteria) this;
        }

        public Criteria andClassUserNotIn(List<Integer> values) {
            addCriterion("class_user not in", values, "classUser");
            return (Criteria) this;
        }

        public Criteria andClassUserBetween(Integer value1, Integer value2) {
            addCriterion("class_user between", value1, value2, "classUser");
            return (Criteria) this;
        }

        public Criteria andClassUserNotBetween(Integer value1, Integer value2) {
            addCriterion("class_user not between", value1, value2, "classUser");
            return (Criteria) this;
        }

        public Criteria andClassAgeIsNull() {
            addCriterion("class_age is null");
            return (Criteria) this;
        }

        public Criteria andClassAgeIsNotNull() {
            addCriterion("class_age is not null");
            return (Criteria) this;
        }

        public Criteria andClassAgeEqualTo(String value) {
            addCriterion("class_age =", value, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeNotEqualTo(String value) {
            addCriterion("class_age <>", value, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeGreaterThan(String value) {
            addCriterion("class_age >", value, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeGreaterThanOrEqualTo(String value) {
            addCriterion("class_age >=", value, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeLessThan(String value) {
            addCriterion("class_age <", value, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeLessThanOrEqualTo(String value) {
            addCriterion("class_age <=", value, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeLike(String value) {
            addCriterion("class_age like", value, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeNotLike(String value) {
            addCriterion("class_age not like", value, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeIn(List<String> values) {
            addCriterion("class_age in", values, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeNotIn(List<String> values) {
            addCriterion("class_age not in", values, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeBetween(String value1, String value2) {
            addCriterion("class_age between", value1, value2, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassAgeNotBetween(String value1, String value2) {
            addCriterion("class_age not between", value1, value2, "classAge");
            return (Criteria) this;
        }

        public Criteria andClassMajorIsNull() {
            addCriterion("class_major is null");
            return (Criteria) this;
        }

        public Criteria andClassMajorIsNotNull() {
            addCriterion("class_major is not null");
            return (Criteria) this;
        }

        public Criteria andClassMajorEqualTo(String value) {
            addCriterion("class_major =", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotEqualTo(String value) {
            addCriterion("class_major <>", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorGreaterThan(String value) {
            addCriterion("class_major >", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorGreaterThanOrEqualTo(String value) {
            addCriterion("class_major >=", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLessThan(String value) {
            addCriterion("class_major <", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLessThanOrEqualTo(String value) {
            addCriterion("class_major <=", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorLike(String value) {
            addCriterion("class_major like", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotLike(String value) {
            addCriterion("class_major not like", value, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorIn(List<String> values) {
            addCriterion("class_major in", values, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotIn(List<String> values) {
            addCriterion("class_major not in", values, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorBetween(String value1, String value2) {
            addCriterion("class_major between", value1, value2, "classMajor");
            return (Criteria) this;
        }

        public Criteria andClassMajorNotBetween(String value1, String value2) {
            addCriterion("class_major not between", value1, value2, "classMajor");
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