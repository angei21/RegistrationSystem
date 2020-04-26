package com.rs.pojo;

import java.util.ArrayList;
import java.util.List;

public class DocumentstockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentstockExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Long value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Long value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Long value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Long value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Long value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Long value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Long> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Long> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Long value1, Long value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Long value1, Long value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDnameIsNull() {
            addCriterion("dname is null");
            return (Criteria) this;
        }

        public Criteria andDnameIsNotNull() {
            addCriterion("dname is not null");
            return (Criteria) this;
        }

        public Criteria andDnameEqualTo(String value) {
            addCriterion("dname =", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotEqualTo(String value) {
            addCriterion("dname <>", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThan(String value) {
            addCriterion("dname >", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameGreaterThanOrEqualTo(String value) {
            addCriterion("dname >=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThan(String value) {
            addCriterion("dname <", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLessThanOrEqualTo(String value) {
            addCriterion("dname <=", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameLike(String value) {
            addCriterion("dname like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotLike(String value) {
            addCriterion("dname not like", value, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameIn(List<String> values) {
            addCriterion("dname in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotIn(List<String> values) {
            addCriterion("dname not in", values, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameBetween(String value1, String value2) {
            addCriterion("dname between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDnameNotBetween(String value1, String value2) {
            addCriterion("dname not between", value1, value2, "dname");
            return (Criteria) this;
        }

        public Criteria andDdescribeIsNull() {
            addCriterion("ddescribe is null");
            return (Criteria) this;
        }

        public Criteria andDdescribeIsNotNull() {
            addCriterion("ddescribe is not null");
            return (Criteria) this;
        }

        public Criteria andDdescribeEqualTo(String value) {
            addCriterion("ddescribe =", value, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeNotEqualTo(String value) {
            addCriterion("ddescribe <>", value, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeGreaterThan(String value) {
            addCriterion("ddescribe >", value, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("ddescribe >=", value, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeLessThan(String value) {
            addCriterion("ddescribe <", value, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeLessThanOrEqualTo(String value) {
            addCriterion("ddescribe <=", value, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeLike(String value) {
            addCriterion("ddescribe like", value, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeNotLike(String value) {
            addCriterion("ddescribe not like", value, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeIn(List<String> values) {
            addCriterion("ddescribe in", values, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeNotIn(List<String> values) {
            addCriterion("ddescribe not in", values, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeBetween(String value1, String value2) {
            addCriterion("ddescribe between", value1, value2, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDdescribeNotBetween(String value1, String value2) {
            addCriterion("ddescribe not between", value1, value2, "ddescribe");
            return (Criteria) this;
        }

        public Criteria andDpathIsNull() {
            addCriterion("dpath is null");
            return (Criteria) this;
        }

        public Criteria andDpathIsNotNull() {
            addCriterion("dpath is not null");
            return (Criteria) this;
        }

        public Criteria andDpathEqualTo(String value) {
            addCriterion("dpath =", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathNotEqualTo(String value) {
            addCriterion("dpath <>", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathGreaterThan(String value) {
            addCriterion("dpath >", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathGreaterThanOrEqualTo(String value) {
            addCriterion("dpath >=", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathLessThan(String value) {
            addCriterion("dpath <", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathLessThanOrEqualTo(String value) {
            addCriterion("dpath <=", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathLike(String value) {
            addCriterion("dpath like", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathNotLike(String value) {
            addCriterion("dpath not like", value, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathIn(List<String> values) {
            addCriterion("dpath in", values, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathNotIn(List<String> values) {
            addCriterion("dpath not in", values, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathBetween(String value1, String value2) {
            addCriterion("dpath between", value1, value2, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpathNotBetween(String value1, String value2) {
            addCriterion("dpath not between", value1, value2, "dpath");
            return (Criteria) this;
        }

        public Criteria andDpictureIsNull() {
            addCriterion("dpicture is null");
            return (Criteria) this;
        }

        public Criteria andDpictureIsNotNull() {
            addCriterion("dpicture is not null");
            return (Criteria) this;
        }

        public Criteria andDpictureEqualTo(String value) {
            addCriterion("dpicture =", value, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureNotEqualTo(String value) {
            addCriterion("dpicture <>", value, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureGreaterThan(String value) {
            addCriterion("dpicture >", value, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureGreaterThanOrEqualTo(String value) {
            addCriterion("dpicture >=", value, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureLessThan(String value) {
            addCriterion("dpicture <", value, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureLessThanOrEqualTo(String value) {
            addCriterion("dpicture <=", value, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureLike(String value) {
            addCriterion("dpicture like", value, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureNotLike(String value) {
            addCriterion("dpicture not like", value, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureIn(List<String> values) {
            addCriterion("dpicture in", values, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureNotIn(List<String> values) {
            addCriterion("dpicture not in", values, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureBetween(String value1, String value2) {
            addCriterion("dpicture between", value1, value2, "dpicture");
            return (Criteria) this;
        }

        public Criteria andDpictureNotBetween(String value1, String value2) {
            addCriterion("dpicture not between", value1, value2, "dpicture");
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