package org.creation.demo.entity.bookdemo;

import java.util.ArrayList;
import java.util.List;

public class NumericPropertyCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public NumericPropertyCriteria() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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

        public Criteria andUniquePropertyCodeIsNull() {
            addCriterion("unique_property_code is null");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeIsNotNull() {
            addCriterion("unique_property_code is not null");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeEqualTo(Long value) {
            addCriterion("unique_property_code =", value, "uniquePropertyCode");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeNotEqualTo(Long value) {
            addCriterion("unique_property_code <>", value, "uniquePropertyCode");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeGreaterThan(Long value) {
            addCriterion("unique_property_code >", value, "uniquePropertyCode");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("unique_property_code >=", value, "uniquePropertyCode");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeLessThan(Long value) {
            addCriterion("unique_property_code <", value, "uniquePropertyCode");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeLessThanOrEqualTo(Long value) {
            addCriterion("unique_property_code <=", value, "uniquePropertyCode");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeIn(List<Long> values) {
            addCriterion("unique_property_code in", values, "uniquePropertyCode");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeNotIn(List<Long> values) {
            addCriterion("unique_property_code not in", values, "uniquePropertyCode");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeBetween(Long value1, Long value2) {
            addCriterion("unique_property_code between", value1, value2, "uniquePropertyCode");
            return (Criteria) this;
        }

        public Criteria andUniquePropertyCodeNotBetween(Long value1, Long value2) {
            addCriterion("unique_property_code not between", value1, value2, "uniquePropertyCode");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeIsNull() {
            addCriterion("unique_entity_code is null");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeIsNotNull() {
            addCriterion("unique_entity_code is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeEqualTo(Long value) {
            addCriterion("unique_entity_code =", value, "uniqueEntityCode");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeNotEqualTo(Long value) {
            addCriterion("unique_entity_code <>", value, "uniqueEntityCode");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeGreaterThan(Long value) {
            addCriterion("unique_entity_code >", value, "uniqueEntityCode");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("unique_entity_code >=", value, "uniqueEntityCode");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeLessThan(Long value) {
            addCriterion("unique_entity_code <", value, "uniqueEntityCode");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeLessThanOrEqualTo(Long value) {
            addCriterion("unique_entity_code <=", value, "uniqueEntityCode");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeIn(List<Long> values) {
            addCriterion("unique_entity_code in", values, "uniqueEntityCode");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeNotIn(List<Long> values) {
            addCriterion("unique_entity_code not in", values, "uniqueEntityCode");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeBetween(Long value1, Long value2) {
            addCriterion("unique_entity_code between", value1, value2, "uniqueEntityCode");
            return (Criteria) this;
        }

        public Criteria andUniqueEntityCodeNotBetween(Long value1, Long value2) {
            addCriterion("unique_entity_code not between", value1, value2, "uniqueEntityCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Long value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Long value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Long value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Long value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Long value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Long value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Long> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Long> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Long value1, Long value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Long value1, Long value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
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