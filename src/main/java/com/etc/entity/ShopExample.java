package com.etc.entity;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSinfoIsNull() {
            addCriterion("sinfo is null");
            return (Criteria) this;
        }

        public Criteria andSinfoIsNotNull() {
            addCriterion("sinfo is not null");
            return (Criteria) this;
        }

        public Criteria andSinfoEqualTo(String value) {
            addCriterion("sinfo =", value, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoNotEqualTo(String value) {
            addCriterion("sinfo <>", value, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoGreaterThan(String value) {
            addCriterion("sinfo >", value, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoGreaterThanOrEqualTo(String value) {
            addCriterion("sinfo >=", value, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoLessThan(String value) {
            addCriterion("sinfo <", value, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoLessThanOrEqualTo(String value) {
            addCriterion("sinfo <=", value, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoLike(String value) {
            addCriterion("sinfo like", value, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoNotLike(String value) {
            addCriterion("sinfo not like", value, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoIn(List<String> values) {
            addCriterion("sinfo in", values, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoNotIn(List<String> values) {
            addCriterion("sinfo not in", values, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoBetween(String value1, String value2) {
            addCriterion("sinfo between", value1, value2, "sinfo");
            return (Criteria) this;
        }

        public Criteria andSinfoNotBetween(String value1, String value2) {
            addCriterion("sinfo not between", value1, value2, "sinfo");
            return (Criteria) this;
        }

        public Criteria andStypeIsNull() {
            addCriterion("stype is null");
            return (Criteria) this;
        }

        public Criteria andStypeIsNotNull() {
            addCriterion("stype is not null");
            return (Criteria) this;
        }

        public Criteria andStypeEqualTo(Integer value) {
            addCriterion("stype =", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotEqualTo(Integer value) {
            addCriterion("stype <>", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThan(Integer value) {
            addCriterion("stype >", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stype >=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThan(Integer value) {
            addCriterion("stype <", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThanOrEqualTo(Integer value) {
            addCriterion("stype <=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeIn(List<Integer> values) {
            addCriterion("stype in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotIn(List<Integer> values) {
            addCriterion("stype not in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeBetween(Integer value1, Integer value2) {
            addCriterion("stype between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotBetween(Integer value1, Integer value2) {
            addCriterion("stype not between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("saddress is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("saddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("saddress =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("saddress <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("saddress >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("saddress >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("saddress <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("saddress <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("saddress like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("saddress not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("saddress in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("saddress not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("saddress between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("saddress not between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andStelIsNull() {
            addCriterion("stel is null");
            return (Criteria) this;
        }

        public Criteria andStelIsNotNull() {
            addCriterion("stel is not null");
            return (Criteria) this;
        }

        public Criteria andStelEqualTo(String value) {
            addCriterion("stel =", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotEqualTo(String value) {
            addCriterion("stel <>", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelGreaterThan(String value) {
            addCriterion("stel >", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelGreaterThanOrEqualTo(String value) {
            addCriterion("stel >=", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelLessThan(String value) {
            addCriterion("stel <", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelLessThanOrEqualTo(String value) {
            addCriterion("stel <=", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelLike(String value) {
            addCriterion("stel like", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotLike(String value) {
            addCriterion("stel not like", value, "stel");
            return (Criteria) this;
        }

        public Criteria andStelIn(List<String> values) {
            addCriterion("stel in", values, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotIn(List<String> values) {
            addCriterion("stel not in", values, "stel");
            return (Criteria) this;
        }

        public Criteria andStelBetween(String value1, String value2) {
            addCriterion("stel between", value1, value2, "stel");
            return (Criteria) this;
        }

        public Criteria andStelNotBetween(String value1, String value2) {
            addCriterion("stel not between", value1, value2, "stel");
            return (Criteria) this;
        }

        public Criteria andSimageIsNull() {
            addCriterion("simage is null");
            return (Criteria) this;
        }

        public Criteria andSimageIsNotNull() {
            addCriterion("simage is not null");
            return (Criteria) this;
        }

        public Criteria andSimageEqualTo(String value) {
            addCriterion("simage =", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageNotEqualTo(String value) {
            addCriterion("simage <>", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageGreaterThan(String value) {
            addCriterion("simage >", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageGreaterThanOrEqualTo(String value) {
            addCriterion("simage >=", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageLessThan(String value) {
            addCriterion("simage <", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageLessThanOrEqualTo(String value) {
            addCriterion("simage <=", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageLike(String value) {
            addCriterion("simage like", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageNotLike(String value) {
            addCriterion("simage not like", value, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageIn(List<String> values) {
            addCriterion("simage in", values, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageNotIn(List<String> values) {
            addCriterion("simage not in", values, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageBetween(String value1, String value2) {
            addCriterion("simage between", value1, value2, "simage");
            return (Criteria) this;
        }

        public Criteria andSimageNotBetween(String value1, String value2) {
            addCriterion("simage not between", value1, value2, "simage");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNull() {
            addCriterion("sstatus is null");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNotNull() {
            addCriterion("sstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSstatusEqualTo(String value) {
            addCriterion("sstatus =", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotEqualTo(String value) {
            addCriterion("sstatus <>", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThan(String value) {
            addCriterion("sstatus >", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThanOrEqualTo(String value) {
            addCriterion("sstatus >=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThan(String value) {
            addCriterion("sstatus <", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThanOrEqualTo(String value) {
            addCriterion("sstatus <=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLike(String value) {
            addCriterion("sstatus like", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotLike(String value) {
            addCriterion("sstatus not like", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusIn(List<String> values) {
            addCriterion("sstatus in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotIn(List<String> values) {
            addCriterion("sstatus not in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusBetween(String value1, String value2) {
            addCriterion("sstatus between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotBetween(String value1, String value2) {
            addCriterion("sstatus not between", value1, value2, "sstatus");
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