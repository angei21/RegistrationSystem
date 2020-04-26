package com.rs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TsubmitworksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TsubmitworksExample() {
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

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(Long value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(Long value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(Long value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(Long value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(Long value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(Long value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<Long> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<Long> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(Long value1, Long value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(Long value1, Long value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNull() {
            addCriterion("teamid is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("teamid is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(Long value) {
            addCriterion("teamid =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(Long value) {
            addCriterion("teamid <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(Long value) {
            addCriterion("teamid >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(Long value) {
            addCriterion("teamid >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(Long value) {
            addCriterion("teamid <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(Long value) {
            addCriterion("teamid <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<Long> values) {
            addCriterion("teamid in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<Long> values) {
            addCriterion("teamid not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(Long value1, Long value2) {
            addCriterion("teamid between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(Long value1, Long value2) {
            addCriterion("teamid not between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTmidIsNull() {
            addCriterion("tmid is null");
            return (Criteria) this;
        }

        public Criteria andTmidIsNotNull() {
            addCriterion("tmid is not null");
            return (Criteria) this;
        }

        public Criteria andTmidEqualTo(Long value) {
            addCriterion("tmid =", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotEqualTo(Long value) {
            addCriterion("tmid <>", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidGreaterThan(Long value) {
            addCriterion("tmid >", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidGreaterThanOrEqualTo(Long value) {
            addCriterion("tmid >=", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLessThan(Long value) {
            addCriterion("tmid <", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLessThanOrEqualTo(Long value) {
            addCriterion("tmid <=", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidIn(List<Long> values) {
            addCriterion("tmid in", values, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotIn(List<Long> values) {
            addCriterion("tmid not in", values, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidBetween(Long value1, Long value2) {
            addCriterion("tmid between", value1, value2, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotBetween(Long value1, Long value2) {
            addCriterion("tmid not between", value1, value2, "tmid");
            return (Criteria) this;
        }

        public Criteria andWorknameIsNull() {
            addCriterion("workname is null");
            return (Criteria) this;
        }

        public Criteria andWorknameIsNotNull() {
            addCriterion("workname is not null");
            return (Criteria) this;
        }

        public Criteria andWorknameEqualTo(String value) {
            addCriterion("workname =", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotEqualTo(String value) {
            addCriterion("workname <>", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThan(String value) {
            addCriterion("workname >", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameGreaterThanOrEqualTo(String value) {
            addCriterion("workname >=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThan(String value) {
            addCriterion("workname <", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLessThanOrEqualTo(String value) {
            addCriterion("workname <=", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameLike(String value) {
            addCriterion("workname like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotLike(String value) {
            addCriterion("workname not like", value, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameIn(List<String> values) {
            addCriterion("workname in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotIn(List<String> values) {
            addCriterion("workname not in", values, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameBetween(String value1, String value2) {
            addCriterion("workname between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andWorknameNotBetween(String value1, String value2) {
            addCriterion("workname not between", value1, value2, "workname");
            return (Criteria) this;
        }

        public Criteria andFirstwriterIsNull() {
            addCriterion("firstwriter is null");
            return (Criteria) this;
        }

        public Criteria andFirstwriterIsNotNull() {
            addCriterion("firstwriter is not null");
            return (Criteria) this;
        }

        public Criteria andFirstwriterEqualTo(String value) {
            addCriterion("firstwriter =", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterNotEqualTo(String value) {
            addCriterion("firstwriter <>", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterGreaterThan(String value) {
            addCriterion("firstwriter >", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterGreaterThanOrEqualTo(String value) {
            addCriterion("firstwriter >=", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterLessThan(String value) {
            addCriterion("firstwriter <", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterLessThanOrEqualTo(String value) {
            addCriterion("firstwriter <=", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterLike(String value) {
            addCriterion("firstwriter like", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterNotLike(String value) {
            addCriterion("firstwriter not like", value, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterIn(List<String> values) {
            addCriterion("firstwriter in", values, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterNotIn(List<String> values) {
            addCriterion("firstwriter not in", values, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterBetween(String value1, String value2) {
            addCriterion("firstwriter between", value1, value2, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andFirstwriterNotBetween(String value1, String value2) {
            addCriterion("firstwriter not between", value1, value2, "firstwriter");
            return (Criteria) this;
        }

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(Long value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(Long value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(Long value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(Long value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(Long value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(Long value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<Long> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<Long> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(Long value1, Long value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(Long value1, Long value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSubmitpathIsNull() {
            addCriterion("submitpath is null");
            return (Criteria) this;
        }

        public Criteria andSubmitpathIsNotNull() {
            addCriterion("submitpath is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitpathEqualTo(String value) {
            addCriterion("submitpath =", value, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathNotEqualTo(String value) {
            addCriterion("submitpath <>", value, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathGreaterThan(String value) {
            addCriterion("submitpath >", value, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathGreaterThanOrEqualTo(String value) {
            addCriterion("submitpath >=", value, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathLessThan(String value) {
            addCriterion("submitpath <", value, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathLessThanOrEqualTo(String value) {
            addCriterion("submitpath <=", value, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathLike(String value) {
            addCriterion("submitpath like", value, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathNotLike(String value) {
            addCriterion("submitpath not like", value, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathIn(List<String> values) {
            addCriterion("submitpath in", values, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathNotIn(List<String> values) {
            addCriterion("submitpath not in", values, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathBetween(String value1, String value2) {
            addCriterion("submitpath between", value1, value2, "submitpath");
            return (Criteria) this;
        }

        public Criteria andSubmitpathNotBetween(String value1, String value2) {
            addCriterion("submitpath not between", value1, value2, "submitpath");
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