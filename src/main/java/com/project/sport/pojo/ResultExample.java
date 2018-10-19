package com.project.sport.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResultExample() {
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

        public Criteria andT_stucollege1IsNull() {
            addCriterion("t_stucollege1 is null");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1IsNotNull() {
            addCriterion("t_stucollege1 is not null");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1EqualTo(String value) {
            addCriterion("t_stucollege1 =", value, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1NotEqualTo(String value) {
            addCriterion("t_stucollege1 <>", value, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1GreaterThan(String value) {
            addCriterion("t_stucollege1 >", value, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1GreaterThanOrEqualTo(String value) {
            addCriterion("t_stucollege1 >=", value, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1LessThan(String value) {
            addCriterion("t_stucollege1 <", value, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1LessThanOrEqualTo(String value) {
            addCriterion("t_stucollege1 <=", value, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1Like(String value) {
            addCriterion("t_stucollege1 like", value, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1NotLike(String value) {
            addCriterion("t_stucollege1 not like", value, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1In(List<String> values) {
            addCriterion("t_stucollege1 in", values, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1NotIn(List<String> values) {
            addCriterion("t_stucollege1 not in", values, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1Between(String value1, String value2) {
            addCriterion("t_stucollege1 between", value1, value2, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege1NotBetween(String value1, String value2) {
            addCriterion("t_stucollege1 not between", value1, value2, "t_stucollege1");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2IsNull() {
            addCriterion("t_stucollege2 is null");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2IsNotNull() {
            addCriterion("t_stucollege2 is not null");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2EqualTo(String value) {
            addCriterion("t_stucollege2 =", value, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2NotEqualTo(String value) {
            addCriterion("t_stucollege2 <>", value, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2GreaterThan(String value) {
            addCriterion("t_stucollege2 >", value, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2GreaterThanOrEqualTo(String value) {
            addCriterion("t_stucollege2 >=", value, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2LessThan(String value) {
            addCriterion("t_stucollege2 <", value, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2LessThanOrEqualTo(String value) {
            addCriterion("t_stucollege2 <=", value, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2Like(String value) {
            addCriterion("t_stucollege2 like", value, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2NotLike(String value) {
            addCriterion("t_stucollege2 not like", value, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2In(List<String> values) {
            addCriterion("t_stucollege2 in", values, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2NotIn(List<String> values) {
            addCriterion("t_stucollege2 not in", values, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2Between(String value1, String value2) {
            addCriterion("t_stucollege2 between", value1, value2, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege2NotBetween(String value1, String value2) {
            addCriterion("t_stucollege2 not between", value1, value2, "t_stucollege2");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3IsNull() {
            addCriterion("t_stucollege3 is null");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3IsNotNull() {
            addCriterion("t_stucollege3 is not null");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3EqualTo(String value) {
            addCriterion("t_stucollege3 =", value, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3NotEqualTo(String value) {
            addCriterion("t_stucollege3 <>", value, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3GreaterThan(String value) {
            addCriterion("t_stucollege3 >", value, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3GreaterThanOrEqualTo(String value) {
            addCriterion("t_stucollege3 >=", value, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3LessThan(String value) {
            addCriterion("t_stucollege3 <", value, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3LessThanOrEqualTo(String value) {
            addCriterion("t_stucollege3 <=", value, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3Like(String value) {
            addCriterion("t_stucollege3 like", value, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3NotLike(String value) {
            addCriterion("t_stucollege3 not like", value, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3In(List<String> values) {
            addCriterion("t_stucollege3 in", values, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3NotIn(List<String> values) {
            addCriterion("t_stucollege3 not in", values, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3Between(String value1, String value2) {
            addCriterion("t_stucollege3 between", value1, value2, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stucollege3NotBetween(String value1, String value2) {
            addCriterion("t_stucollege3 not between", value1, value2, "t_stucollege3");
            return (Criteria) this;
        }

        public Criteria andT_stuname1IsNull() {
            addCriterion("t_stuname1 is null");
            return (Criteria) this;
        }

        public Criteria andT_stuname1IsNotNull() {
            addCriterion("t_stuname1 is not null");
            return (Criteria) this;
        }

        public Criteria andT_stuname1EqualTo(String value) {
            addCriterion("t_stuname1 =", value, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1NotEqualTo(String value) {
            addCriterion("t_stuname1 <>", value, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1GreaterThan(String value) {
            addCriterion("t_stuname1 >", value, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1GreaterThanOrEqualTo(String value) {
            addCriterion("t_stuname1 >=", value, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1LessThan(String value) {
            addCriterion("t_stuname1 <", value, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1LessThanOrEqualTo(String value) {
            addCriterion("t_stuname1 <=", value, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1Like(String value) {
            addCriterion("t_stuname1 like", value, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1NotLike(String value) {
            addCriterion("t_stuname1 not like", value, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1In(List<String> values) {
            addCriterion("t_stuname1 in", values, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1NotIn(List<String> values) {
            addCriterion("t_stuname1 not in", values, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1Between(String value1, String value2) {
            addCriterion("t_stuname1 between", value1, value2, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname1NotBetween(String value1, String value2) {
            addCriterion("t_stuname1 not between", value1, value2, "t_stuname1");
            return (Criteria) this;
        }

        public Criteria andT_stuname2IsNull() {
            addCriterion("t_stuname2 is null");
            return (Criteria) this;
        }

        public Criteria andT_stuname2IsNotNull() {
            addCriterion("t_stuname2 is not null");
            return (Criteria) this;
        }

        public Criteria andT_stuname2EqualTo(String value) {
            addCriterion("t_stuname2 =", value, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2NotEqualTo(String value) {
            addCriterion("t_stuname2 <>", value, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2GreaterThan(String value) {
            addCriterion("t_stuname2 >", value, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2GreaterThanOrEqualTo(String value) {
            addCriterion("t_stuname2 >=", value, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2LessThan(String value) {
            addCriterion("t_stuname2 <", value, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2LessThanOrEqualTo(String value) {
            addCriterion("t_stuname2 <=", value, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2Like(String value) {
            addCriterion("t_stuname2 like", value, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2NotLike(String value) {
            addCriterion("t_stuname2 not like", value, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2In(List<String> values) {
            addCriterion("t_stuname2 in", values, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2NotIn(List<String> values) {
            addCriterion("t_stuname2 not in", values, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2Between(String value1, String value2) {
            addCriterion("t_stuname2 between", value1, value2, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname2NotBetween(String value1, String value2) {
            addCriterion("t_stuname2 not between", value1, value2, "t_stuname2");
            return (Criteria) this;
        }

        public Criteria andT_stuname3IsNull() {
            addCriterion("t_stuname3 is null");
            return (Criteria) this;
        }

        public Criteria andT_stuname3IsNotNull() {
            addCriterion("t_stuname3 is not null");
            return (Criteria) this;
        }

        public Criteria andT_stuname3EqualTo(String value) {
            addCriterion("t_stuname3 =", value, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3NotEqualTo(String value) {
            addCriterion("t_stuname3 <>", value, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3GreaterThan(String value) {
            addCriterion("t_stuname3 >", value, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3GreaterThanOrEqualTo(String value) {
            addCriterion("t_stuname3 >=", value, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3LessThan(String value) {
            addCriterion("t_stuname3 <", value, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3LessThanOrEqualTo(String value) {
            addCriterion("t_stuname3 <=", value, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3Like(String value) {
            addCriterion("t_stuname3 like", value, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3NotLike(String value) {
            addCriterion("t_stuname3 not like", value, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3In(List<String> values) {
            addCriterion("t_stuname3 in", values, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3NotIn(List<String> values) {
            addCriterion("t_stuname3 not in", values, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3Between(String value1, String value2) {
            addCriterion("t_stuname3 between", value1, value2, "t_stuname3");
            return (Criteria) this;
        }

        public Criteria andT_stuname3NotBetween(String value1, String value2) {
            addCriterion("t_stuname3 not between", value1, value2, "t_stuname3");
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