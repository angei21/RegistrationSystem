package com.rs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TwordscoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TwordscoreExample() {
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

        public Criteria andSidEqualTo(Long value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Long value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Long value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Long value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Long value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Long value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Long> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Long> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Long value1, Long value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Long value1, Long value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
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

        public Criteria andScoretotalIsNull() {
            addCriterion("scoretotal is null");
            return (Criteria) this;
        }

        public Criteria andScoretotalIsNotNull() {
            addCriterion("scoretotal is not null");
            return (Criteria) this;
        }

        public Criteria andScoretotalEqualTo(Integer value) {
            addCriterion("scoretotal =", value, "scoretotal");
            return (Criteria) this;
        }

        public Criteria andScoretotalNotEqualTo(Integer value) {
            addCriterion("scoretotal <>", value, "scoretotal");
            return (Criteria) this;
        }

        public Criteria andScoretotalGreaterThan(Integer value) {
            addCriterion("scoretotal >", value, "scoretotal");
            return (Criteria) this;
        }

        public Criteria andScoretotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("scoretotal >=", value, "scoretotal");
            return (Criteria) this;
        }

        public Criteria andScoretotalLessThan(Integer value) {
            addCriterion("scoretotal <", value, "scoretotal");
            return (Criteria) this;
        }

        public Criteria andScoretotalLessThanOrEqualTo(Integer value) {
            addCriterion("scoretotal <=", value, "scoretotal");
            return (Criteria) this;
        }

        public Criteria andScoretotalIn(List<Integer> values) {
            addCriterion("scoretotal in", values, "scoretotal");
            return (Criteria) this;
        }

        public Criteria andScoretotalNotIn(List<Integer> values) {
            addCriterion("scoretotal not in", values, "scoretotal");
            return (Criteria) this;
        }

        public Criteria andScoretotalBetween(Integer value1, Integer value2) {
            addCriterion("scoretotal between", value1, value2, "scoretotal");
            return (Criteria) this;
        }

        public Criteria andScoretotalNotBetween(Integer value1, Integer value2) {
            addCriterion("scoretotal not between", value1, value2, "scoretotal");
            return (Criteria) this;
        }

        public Criteria andRaterIsNull() {
            addCriterion("rater is null");
            return (Criteria) this;
        }

        public Criteria andRaterIsNotNull() {
            addCriterion("rater is not null");
            return (Criteria) this;
        }

        public Criteria andRaterEqualTo(Integer value) {
            addCriterion("rater =", value, "rater");
            return (Criteria) this;
        }

        public Criteria andRaterNotEqualTo(Integer value) {
            addCriterion("rater <>", value, "rater");
            return (Criteria) this;
        }

        public Criteria andRaterGreaterThan(Integer value) {
            addCriterion("rater >", value, "rater");
            return (Criteria) this;
        }

        public Criteria andRaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("rater >=", value, "rater");
            return (Criteria) this;
        }

        public Criteria andRaterLessThan(Integer value) {
            addCriterion("rater <", value, "rater");
            return (Criteria) this;
        }

        public Criteria andRaterLessThanOrEqualTo(Integer value) {
            addCriterion("rater <=", value, "rater");
            return (Criteria) this;
        }

        public Criteria andRaterIn(List<Integer> values) {
            addCriterion("rater in", values, "rater");
            return (Criteria) this;
        }

        public Criteria andRaterNotIn(List<Integer> values) {
            addCriterion("rater not in", values, "rater");
            return (Criteria) this;
        }

        public Criteria andRaterBetween(Integer value1, Integer value2) {
            addCriterion("rater between", value1, value2, "rater");
            return (Criteria) this;
        }

        public Criteria andRaterNotBetween(Integer value1, Integer value2) {
            addCriterion("rater not between", value1, value2, "rater");
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