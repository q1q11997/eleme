package com.etc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNull() {
            addCriterion("gprice is null");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNotNull() {
            addCriterion("gprice is not null");
            return (Criteria) this;
        }

        public Criteria andGpriceEqualTo(BigDecimal value) {
            addCriterion("gprice =", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotEqualTo(BigDecimal value) {
            addCriterion("gprice <>", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThan(BigDecimal value) {
            addCriterion("gprice >", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice >=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThan(BigDecimal value) {
            addCriterion("gprice <", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gprice <=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceIn(List<BigDecimal> values) {
            addCriterion("gprice in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotIn(List<BigDecimal> values) {
            addCriterion("gprice not in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gprice not between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGcountIsNull() {
            addCriterion("gcount is null");
            return (Criteria) this;
        }

        public Criteria andGcountIsNotNull() {
            addCriterion("gcount is not null");
            return (Criteria) this;
        }

        public Criteria andGcountEqualTo(Integer value) {
            addCriterion("gcount =", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountNotEqualTo(Integer value) {
            addCriterion("gcount <>", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountGreaterThan(Integer value) {
            addCriterion("gcount >", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("gcount >=", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountLessThan(Integer value) {
            addCriterion("gcount <", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountLessThanOrEqualTo(Integer value) {
            addCriterion("gcount <=", value, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountIn(List<Integer> values) {
            addCriterion("gcount in", values, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountNotIn(List<Integer> values) {
            addCriterion("gcount not in", values, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountBetween(Integer value1, Integer value2) {
            addCriterion("gcount between", value1, value2, "gcount");
            return (Criteria) this;
        }

        public Criteria andGcountNotBetween(Integer value1, Integer value2) {
            addCriterion("gcount not between", value1, value2, "gcount");
            return (Criteria) this;
        }

        public Criteria andGinfoIsNull() {
            addCriterion("ginfo is null");
            return (Criteria) this;
        }

        public Criteria andGinfoIsNotNull() {
            addCriterion("ginfo is not null");
            return (Criteria) this;
        }

        public Criteria andGinfoEqualTo(String value) {
            addCriterion("ginfo =", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoNotEqualTo(String value) {
            addCriterion("ginfo <>", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoGreaterThan(String value) {
            addCriterion("ginfo >", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoGreaterThanOrEqualTo(String value) {
            addCriterion("ginfo >=", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoLessThan(String value) {
            addCriterion("ginfo <", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoLessThanOrEqualTo(String value) {
            addCriterion("ginfo <=", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoLike(String value) {
            addCriterion("ginfo like", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoNotLike(String value) {
            addCriterion("ginfo not like", value, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoIn(List<String> values) {
            addCriterion("ginfo in", values, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoNotIn(List<String> values) {
            addCriterion("ginfo not in", values, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoBetween(String value1, String value2) {
            addCriterion("ginfo between", value1, value2, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGinfoNotBetween(String value1, String value2) {
            addCriterion("ginfo not between", value1, value2, "ginfo");
            return (Criteria) this;
        }

        public Criteria andGimageIsNull() {
            addCriterion("gimage is null");
            return (Criteria) this;
        }

        public Criteria andGimageIsNotNull() {
            addCriterion("gimage is not null");
            return (Criteria) this;
        }

        public Criteria andGimageEqualTo(String value) {
            addCriterion("gimage =", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageNotEqualTo(String value) {
            addCriterion("gimage <>", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageGreaterThan(String value) {
            addCriterion("gimage >", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageGreaterThanOrEqualTo(String value) {
            addCriterion("gimage >=", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageLessThan(String value) {
            addCriterion("gimage <", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageLessThanOrEqualTo(String value) {
            addCriterion("gimage <=", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageLike(String value) {
            addCriterion("gimage like", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageNotLike(String value) {
            addCriterion("gimage not like", value, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageIn(List<String> values) {
            addCriterion("gimage in", values, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageNotIn(List<String> values) {
            addCriterion("gimage not in", values, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageBetween(String value1, String value2) {
            addCriterion("gimage between", value1, value2, "gimage");
            return (Criteria) this;
        }

        public Criteria andGimageNotBetween(String value1, String value2) {
            addCriterion("gimage not between", value1, value2, "gimage");
            return (Criteria) this;
        }

        public Criteria andGboxIsNull() {
            addCriterion("gbox is null");
            return (Criteria) this;
        }

        public Criteria andGboxIsNotNull() {
            addCriterion("gbox is not null");
            return (Criteria) this;
        }

        public Criteria andGboxEqualTo(BigDecimal value) {
            addCriterion("gbox =", value, "gbox");
            return (Criteria) this;
        }

        public Criteria andGboxNotEqualTo(BigDecimal value) {
            addCriterion("gbox <>", value, "gbox");
            return (Criteria) this;
        }

        public Criteria andGboxGreaterThan(BigDecimal value) {
            addCriterion("gbox >", value, "gbox");
            return (Criteria) this;
        }

        public Criteria andGboxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gbox >=", value, "gbox");
            return (Criteria) this;
        }

        public Criteria andGboxLessThan(BigDecimal value) {
            addCriterion("gbox <", value, "gbox");
            return (Criteria) this;
        }

        public Criteria andGboxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gbox <=", value, "gbox");
            return (Criteria) this;
        }

        public Criteria andGboxIn(List<BigDecimal> values) {
            addCriterion("gbox in", values, "gbox");
            return (Criteria) this;
        }

        public Criteria andGboxNotIn(List<BigDecimal> values) {
            addCriterion("gbox not in", values, "gbox");
            return (Criteria) this;
        }

        public Criteria andGboxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gbox between", value1, value2, "gbox");
            return (Criteria) this;
        }

        public Criteria andGboxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gbox not between", value1, value2, "gbox");
            return (Criteria) this;
        }

        public Criteria andGtidIsNull() {
            addCriterion("gtid is null");
            return (Criteria) this;
        }

        public Criteria andGtidIsNotNull() {
            addCriterion("gtid is not null");
            return (Criteria) this;
        }

        public Criteria andGtidEqualTo(Integer value) {
            addCriterion("gtid =", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotEqualTo(Integer value) {
            addCriterion("gtid <>", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidGreaterThan(Integer value) {
            addCriterion("gtid >", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gtid >=", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidLessThan(Integer value) {
            addCriterion("gtid <", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidLessThanOrEqualTo(Integer value) {
            addCriterion("gtid <=", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidIn(List<Integer> values) {
            addCriterion("gtid in", values, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotIn(List<Integer> values) {
            addCriterion("gtid not in", values, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidBetween(Integer value1, Integer value2) {
            addCriterion("gtid between", value1, value2, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotBetween(Integer value1, Integer value2) {
            addCriterion("gtid not between", value1, value2, "gtid");
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