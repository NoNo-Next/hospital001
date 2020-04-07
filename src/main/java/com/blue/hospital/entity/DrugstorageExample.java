package com.blue.hospital.entity;

import java.util.ArrayList;
import java.util.List;

public class DrugstorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrugstorageExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andDrugstorageidIsNull() {
            addCriterion("drugStorageid is null");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidIsNotNull() {
            addCriterion("drugStorageid is not null");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidEqualTo(Integer value) {
            addCriterion("drugStorageid =", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidNotEqualTo(Integer value) {
            addCriterion("drugStorageid <>", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidGreaterThan(Integer value) {
            addCriterion("drugStorageid >", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugStorageid >=", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidLessThan(Integer value) {
            addCriterion("drugStorageid <", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidLessThanOrEqualTo(Integer value) {
            addCriterion("drugStorageid <=", value, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidIn(List<Integer> values) {
            addCriterion("drugStorageid in", values, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidNotIn(List<Integer> values) {
            addCriterion("drugStorageid not in", values, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidBetween(Integer value1, Integer value2) {
            addCriterion("drugStorageid between", value1, value2, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugstorageidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugStorageid not between", value1, value2, "drugstorageid");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameIsNull() {
            addCriterion("drugsStrongName is null");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameIsNotNull() {
            addCriterion("drugsStrongName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameEqualTo(String value) {
            addCriterion("drugsStrongName =", value, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameNotEqualTo(String value) {
            addCriterion("drugsStrongName <>", value, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameGreaterThan(String value) {
            addCriterion("drugsStrongName >", value, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameGreaterThanOrEqualTo(String value) {
            addCriterion("drugsStrongName >=", value, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameLessThan(String value) {
            addCriterion("drugsStrongName <", value, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameLessThanOrEqualTo(String value) {
            addCriterion("drugsStrongName <=", value, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameLike(String value) {
            addCriterion("drugsStrongName like", value, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameNotLike(String value) {
            addCriterion("drugsStrongName not like", value, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameIn(List<String> values) {
            addCriterion("drugsStrongName in", values, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameNotIn(List<String> values) {
            addCriterion("drugsStrongName not in", values, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameBetween(String value1, String value2) {
            addCriterion("drugsStrongName between", value1, value2, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsstrongnameNotBetween(String value1, String value2) {
            addCriterion("drugsStrongName not between", value1, value2, "drugsstrongname");
            return (Criteria) this;
        }

        public Criteria andDrugsidIsNull() {
            addCriterion("drugsId is null");
            return (Criteria) this;
        }

        public Criteria andDrugsidIsNotNull() {
            addCriterion("drugsId is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsidEqualTo(Integer value) {
            addCriterion("drugsId =", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotEqualTo(Integer value) {
            addCriterion("drugsId <>", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidGreaterThan(Integer value) {
            addCriterion("drugsId >", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsId >=", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidLessThan(Integer value) {
            addCriterion("drugsId <", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidLessThanOrEqualTo(Integer value) {
            addCriterion("drugsId <=", value, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidIn(List<Integer> values) {
            addCriterion("drugsId in", values, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotIn(List<Integer> values) {
            addCriterion("drugsId not in", values, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidBetween(Integer value1, Integer value2) {
            addCriterion("drugsId between", value1, value2, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsId not between", value1, value2, "drugsid");
            return (Criteria) this;
        }

        public Criteria andDrugsnumIsNull() {
            addCriterion("drugsNum is null");
            return (Criteria) this;
        }

        public Criteria andDrugsnumIsNotNull() {
            addCriterion("drugsNum is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsnumEqualTo(Integer value) {
            addCriterion("drugsNum =", value, "drugsnum");
            return (Criteria) this;
        }

        public Criteria andDrugsnumNotEqualTo(Integer value) {
            addCriterion("drugsNum <>", value, "drugsnum");
            return (Criteria) this;
        }

        public Criteria andDrugsnumGreaterThan(Integer value) {
            addCriterion("drugsNum >", value, "drugsnum");
            return (Criteria) this;
        }

        public Criteria andDrugsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsNum >=", value, "drugsnum");
            return (Criteria) this;
        }

        public Criteria andDrugsnumLessThan(Integer value) {
            addCriterion("drugsNum <", value, "drugsnum");
            return (Criteria) this;
        }

        public Criteria andDrugsnumLessThanOrEqualTo(Integer value) {
            addCriterion("drugsNum <=", value, "drugsnum");
            return (Criteria) this;
        }

        public Criteria andDrugsnumIn(List<Integer> values) {
            addCriterion("drugsNum in", values, "drugsnum");
            return (Criteria) this;
        }

        public Criteria andDrugsnumNotIn(List<Integer> values) {
            addCriterion("drugsNum not in", values, "drugsnum");
            return (Criteria) this;
        }

        public Criteria andDrugsnumBetween(Integer value1, Integer value2) {
            addCriterion("drugsNum between", value1, value2, "drugsnum");
            return (Criteria) this;
        }

        public Criteria andDrugsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsNum not between", value1, value2, "drugsnum");
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