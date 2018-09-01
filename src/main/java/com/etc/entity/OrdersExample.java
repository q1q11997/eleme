package com.etc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNull() {
            addCriterion("otime is null");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNotNull() {
            addCriterion("otime is not null");
            return (Criteria) this;
        }

        public Criteria andOtimeEqualTo(Date value) {
            addCriterion("otime =", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotEqualTo(Date value) {
            addCriterion("otime <>", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThan(Date value) {
            addCriterion("otime >", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("otime >=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThan(Date value) {
            addCriterion("otime <", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThanOrEqualTo(Date value) {
            addCriterion("otime <=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeIn(List<Date> values) {
            addCriterion("otime in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotIn(List<Date> values) {
            addCriterion("otime not in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeBetween(Date value1, Date value2) {
            addCriterion("otime between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotBetween(Date value1, Date value2) {
            addCriterion("otime not between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNull() {
            addCriterion("ostatus is null");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNotNull() {
            addCriterion("ostatus is not null");
            return (Criteria) this;
        }

        public Criteria andOstatusEqualTo(String value) {
            addCriterion("ostatus =", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotEqualTo(String value) {
            addCriterion("ostatus <>", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThan(String value) {
            addCriterion("ostatus >", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ostatus >=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThan(String value) {
            addCriterion("ostatus <", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThanOrEqualTo(String value) {
            addCriterion("ostatus <=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLike(String value) {
            addCriterion("ostatus like", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotLike(String value) {
            addCriterion("ostatus not like", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusIn(List<String> values) {
            addCriterion("ostatus in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotIn(List<String> values) {
            addCriterion("ostatus not in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusBetween(String value1, String value2) {
            addCriterion("ostatus between", value1, value2, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotBetween(String value1, String value2) {
            addCriterion("ostatus not between", value1, value2, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOtotalIsNull() {
            addCriterion("ototal is null");
            return (Criteria) this;
        }

        public Criteria andOtotalIsNotNull() {
            addCriterion("ototal is not null");
            return (Criteria) this;
        }

        public Criteria andOtotalEqualTo(BigDecimal value) {
            addCriterion("ototal =", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalNotEqualTo(BigDecimal value) {
            addCriterion("ototal <>", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalGreaterThan(BigDecimal value) {
            addCriterion("ototal >", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ototal >=", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalLessThan(BigDecimal value) {
            addCriterion("ototal <", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ototal <=", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalIn(List<BigDecimal> values) {
            addCriterion("ototal in", values, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalNotIn(List<BigDecimal> values) {
            addCriterion("ototal not in", values, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ototal between", value1, value2, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ototal not between", value1, value2, "ototal");
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