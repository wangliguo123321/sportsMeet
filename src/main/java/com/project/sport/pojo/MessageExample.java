package com.project.sport.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andT_msgIsNull() {
            addCriterion("t_msg is null");
            return (Criteria) this;
        }

        public Criteria andT_msgIsNotNull() {
            addCriterion("t_msg is not null");
            return (Criteria) this;
        }

        public Criteria andT_msgEqualTo(String value) {
            addCriterion("t_msg =", value, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgNotEqualTo(String value) {
            addCriterion("t_msg <>", value, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgGreaterThan(String value) {
            addCriterion("t_msg >", value, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgGreaterThanOrEqualTo(String value) {
            addCriterion("t_msg >=", value, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgLessThan(String value) {
            addCriterion("t_msg <", value, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgLessThanOrEqualTo(String value) {
            addCriterion("t_msg <=", value, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgLike(String value) {
            addCriterion("t_msg like", value, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgNotLike(String value) {
            addCriterion("t_msg not like", value, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgIn(List<String> values) {
            addCriterion("t_msg in", values, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgNotIn(List<String> values) {
            addCriterion("t_msg not in", values, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgBetween(String value1, String value2) {
            addCriterion("t_msg between", value1, value2, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_msgNotBetween(String value1, String value2) {
            addCriterion("t_msg not between", value1, value2, "t_msg");
            return (Criteria) this;
        }

        public Criteria andT_nameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andT_nameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andT_nameEqualTo(String value) {
            addCriterion("t_name =", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameGreaterThan(String value) {
            addCriterion("t_name >", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameLessThan(String value) {
            addCriterion("t_name <", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameLike(String value) {
            addCriterion("t_name like", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameNotLike(String value) {
            addCriterion("t_name not like", value, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameIn(List<String> values) {
            addCriterion("t_name in", values, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_nameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "t_name");
            return (Criteria) this;
        }

        public Criteria andT_timeIsNull() {
            addCriterion("t_time is null");
            return (Criteria) this;
        }

        public Criteria andT_timeIsNotNull() {
            addCriterion("t_time is not null");
            return (Criteria) this;
        }

        public Criteria andT_timeEqualTo(String value) {
            addCriterion("t_time =", value, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeNotEqualTo(String value) {
            addCriterion("t_time <>", value, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeGreaterThan(String value) {
            addCriterion("t_time >", value, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeGreaterThanOrEqualTo(String value) {
            addCriterion("t_time >=", value, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeLessThan(String value) {
            addCriterion("t_time <", value, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeLessThanOrEqualTo(String value) {
            addCriterion("t_time <=", value, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeLike(String value) {
            addCriterion("t_time like", value, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeNotLike(String value) {
            addCriterion("t_time not like", value, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeIn(List<String> values) {
            addCriterion("t_time in", values, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeNotIn(List<String> values) {
            addCriterion("t_time not in", values, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeBetween(String value1, String value2) {
            addCriterion("t_time between", value1, value2, "t_time");
            return (Criteria) this;
        }

        public Criteria andT_timeNotBetween(String value1, String value2) {
            addCriterion("t_time not between", value1, value2, "t_time");
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