package com.rs.pojo;

import java.util.ArrayList;
import java.util.List;

public class TteamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TteamExample() {
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

        public Criteria andHeadnameIsNull() {
            addCriterion("headname is null");
            return (Criteria) this;
        }

        public Criteria andHeadnameIsNotNull() {
            addCriterion("headname is not null");
            return (Criteria) this;
        }

        public Criteria andHeadnameEqualTo(String value) {
            addCriterion("headname =", value, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameNotEqualTo(String value) {
            addCriterion("headname <>", value, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameGreaterThan(String value) {
            addCriterion("headname >", value, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameGreaterThanOrEqualTo(String value) {
            addCriterion("headname >=", value, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameLessThan(String value) {
            addCriterion("headname <", value, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameLessThanOrEqualTo(String value) {
            addCriterion("headname <=", value, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameLike(String value) {
            addCriterion("headname like", value, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameNotLike(String value) {
            addCriterion("headname not like", value, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameIn(List<String> values) {
            addCriterion("headname in", values, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameNotIn(List<String> values) {
            addCriterion("headname not in", values, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameBetween(String value1, String value2) {
            addCriterion("headname between", value1, value2, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadnameNotBetween(String value1, String value2) {
            addCriterion("headname not between", value1, value2, "headname");
            return (Criteria) this;
        }

        public Criteria andHeadclassIsNull() {
            addCriterion("headclass is null");
            return (Criteria) this;
        }

        public Criteria andHeadclassIsNotNull() {
            addCriterion("headclass is not null");
            return (Criteria) this;
        }

        public Criteria andHeadclassEqualTo(String value) {
            addCriterion("headclass =", value, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassNotEqualTo(String value) {
            addCriterion("headclass <>", value, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassGreaterThan(String value) {
            addCriterion("headclass >", value, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassGreaterThanOrEqualTo(String value) {
            addCriterion("headclass >=", value, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassLessThan(String value) {
            addCriterion("headclass <", value, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassLessThanOrEqualTo(String value) {
            addCriterion("headclass <=", value, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassLike(String value) {
            addCriterion("headclass like", value, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassNotLike(String value) {
            addCriterion("headclass not like", value, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassIn(List<String> values) {
            addCriterion("headclass in", values, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassNotIn(List<String> values) {
            addCriterion("headclass not in", values, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassBetween(String value1, String value2) {
            addCriterion("headclass between", value1, value2, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadclassNotBetween(String value1, String value2) {
            addCriterion("headclass not between", value1, value2, "headclass");
            return (Criteria) this;
        }

        public Criteria andHeadtelIsNull() {
            addCriterion("headtel is null");
            return (Criteria) this;
        }

        public Criteria andHeadtelIsNotNull() {
            addCriterion("headtel is not null");
            return (Criteria) this;
        }

        public Criteria andHeadtelEqualTo(String value) {
            addCriterion("headtel =", value, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelNotEqualTo(String value) {
            addCriterion("headtel <>", value, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelGreaterThan(String value) {
            addCriterion("headtel >", value, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelGreaterThanOrEqualTo(String value) {
            addCriterion("headtel >=", value, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelLessThan(String value) {
            addCriterion("headtel <", value, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelLessThanOrEqualTo(String value) {
            addCriterion("headtel <=", value, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelLike(String value) {
            addCriterion("headtel like", value, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelNotLike(String value) {
            addCriterion("headtel not like", value, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelIn(List<String> values) {
            addCriterion("headtel in", values, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelNotIn(List<String> values) {
            addCriterion("headtel not in", values, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelBetween(String value1, String value2) {
            addCriterion("headtel between", value1, value2, "headtel");
            return (Criteria) this;
        }

        public Criteria andHeadtelNotBetween(String value1, String value2) {
            addCriterion("headtel not between", value1, value2, "headtel");
            return (Criteria) this;
        }

        public Criteria andOnenameIsNull() {
            addCriterion("onename is null");
            return (Criteria) this;
        }

        public Criteria andOnenameIsNotNull() {
            addCriterion("onename is not null");
            return (Criteria) this;
        }

        public Criteria andOnenameEqualTo(String value) {
            addCriterion("onename =", value, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameNotEqualTo(String value) {
            addCriterion("onename <>", value, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameGreaterThan(String value) {
            addCriterion("onename >", value, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameGreaterThanOrEqualTo(String value) {
            addCriterion("onename >=", value, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameLessThan(String value) {
            addCriterion("onename <", value, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameLessThanOrEqualTo(String value) {
            addCriterion("onename <=", value, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameLike(String value) {
            addCriterion("onename like", value, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameNotLike(String value) {
            addCriterion("onename not like", value, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameIn(List<String> values) {
            addCriterion("onename in", values, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameNotIn(List<String> values) {
            addCriterion("onename not in", values, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameBetween(String value1, String value2) {
            addCriterion("onename between", value1, value2, "onename");
            return (Criteria) this;
        }

        public Criteria andOnenameNotBetween(String value1, String value2) {
            addCriterion("onename not between", value1, value2, "onename");
            return (Criteria) this;
        }

        public Criteria andOneclassIsNull() {
            addCriterion("oneclass is null");
            return (Criteria) this;
        }

        public Criteria andOneclassIsNotNull() {
            addCriterion("oneclass is not null");
            return (Criteria) this;
        }

        public Criteria andOneclassEqualTo(String value) {
            addCriterion("oneclass =", value, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassNotEqualTo(String value) {
            addCriterion("oneclass <>", value, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassGreaterThan(String value) {
            addCriterion("oneclass >", value, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassGreaterThanOrEqualTo(String value) {
            addCriterion("oneclass >=", value, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassLessThan(String value) {
            addCriterion("oneclass <", value, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassLessThanOrEqualTo(String value) {
            addCriterion("oneclass <=", value, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassLike(String value) {
            addCriterion("oneclass like", value, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassNotLike(String value) {
            addCriterion("oneclass not like", value, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassIn(List<String> values) {
            addCriterion("oneclass in", values, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassNotIn(List<String> values) {
            addCriterion("oneclass not in", values, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassBetween(String value1, String value2) {
            addCriterion("oneclass between", value1, value2, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOneclassNotBetween(String value1, String value2) {
            addCriterion("oneclass not between", value1, value2, "oneclass");
            return (Criteria) this;
        }

        public Criteria andOnephoneIsNull() {
            addCriterion("onephone is null");
            return (Criteria) this;
        }

        public Criteria andOnephoneIsNotNull() {
            addCriterion("onephone is not null");
            return (Criteria) this;
        }

        public Criteria andOnephoneEqualTo(String value) {
            addCriterion("onephone =", value, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneNotEqualTo(String value) {
            addCriterion("onephone <>", value, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneGreaterThan(String value) {
            addCriterion("onephone >", value, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneGreaterThanOrEqualTo(String value) {
            addCriterion("onephone >=", value, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneLessThan(String value) {
            addCriterion("onephone <", value, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneLessThanOrEqualTo(String value) {
            addCriterion("onephone <=", value, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneLike(String value) {
            addCriterion("onephone like", value, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneNotLike(String value) {
            addCriterion("onephone not like", value, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneIn(List<String> values) {
            addCriterion("onephone in", values, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneNotIn(List<String> values) {
            addCriterion("onephone not in", values, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneBetween(String value1, String value2) {
            addCriterion("onephone between", value1, value2, "onephone");
            return (Criteria) this;
        }

        public Criteria andOnephoneNotBetween(String value1, String value2) {
            addCriterion("onephone not between", value1, value2, "onephone");
            return (Criteria) this;
        }

        public Criteria andTwonameIsNull() {
            addCriterion("twoname is null");
            return (Criteria) this;
        }

        public Criteria andTwonameIsNotNull() {
            addCriterion("twoname is not null");
            return (Criteria) this;
        }

        public Criteria andTwonameEqualTo(String value) {
            addCriterion("twoname =", value, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameNotEqualTo(String value) {
            addCriterion("twoname <>", value, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameGreaterThan(String value) {
            addCriterion("twoname >", value, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameGreaterThanOrEqualTo(String value) {
            addCriterion("twoname >=", value, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameLessThan(String value) {
            addCriterion("twoname <", value, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameLessThanOrEqualTo(String value) {
            addCriterion("twoname <=", value, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameLike(String value) {
            addCriterion("twoname like", value, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameNotLike(String value) {
            addCriterion("twoname not like", value, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameIn(List<String> values) {
            addCriterion("twoname in", values, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameNotIn(List<String> values) {
            addCriterion("twoname not in", values, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameBetween(String value1, String value2) {
            addCriterion("twoname between", value1, value2, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwonameNotBetween(String value1, String value2) {
            addCriterion("twoname not between", value1, value2, "twoname");
            return (Criteria) this;
        }

        public Criteria andTwoclassIsNull() {
            addCriterion("twoclass is null");
            return (Criteria) this;
        }

        public Criteria andTwoclassIsNotNull() {
            addCriterion("twoclass is not null");
            return (Criteria) this;
        }

        public Criteria andTwoclassEqualTo(String value) {
            addCriterion("twoclass =", value, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassNotEqualTo(String value) {
            addCriterion("twoclass <>", value, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassGreaterThan(String value) {
            addCriterion("twoclass >", value, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassGreaterThanOrEqualTo(String value) {
            addCriterion("twoclass >=", value, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassLessThan(String value) {
            addCriterion("twoclass <", value, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassLessThanOrEqualTo(String value) {
            addCriterion("twoclass <=", value, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassLike(String value) {
            addCriterion("twoclass like", value, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassNotLike(String value) {
            addCriterion("twoclass not like", value, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassIn(List<String> values) {
            addCriterion("twoclass in", values, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassNotIn(List<String> values) {
            addCriterion("twoclass not in", values, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassBetween(String value1, String value2) {
            addCriterion("twoclass between", value1, value2, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwoclassNotBetween(String value1, String value2) {
            addCriterion("twoclass not between", value1, value2, "twoclass");
            return (Criteria) this;
        }

        public Criteria andTwophoneIsNull() {
            addCriterion("twophone is null");
            return (Criteria) this;
        }

        public Criteria andTwophoneIsNotNull() {
            addCriterion("twophone is not null");
            return (Criteria) this;
        }

        public Criteria andTwophoneEqualTo(String value) {
            addCriterion("twophone =", value, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneNotEqualTo(String value) {
            addCriterion("twophone <>", value, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneGreaterThan(String value) {
            addCriterion("twophone >", value, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneGreaterThanOrEqualTo(String value) {
            addCriterion("twophone >=", value, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneLessThan(String value) {
            addCriterion("twophone <", value, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneLessThanOrEqualTo(String value) {
            addCriterion("twophone <=", value, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneLike(String value) {
            addCriterion("twophone like", value, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneNotLike(String value) {
            addCriterion("twophone not like", value, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneIn(List<String> values) {
            addCriterion("twophone in", values, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneNotIn(List<String> values) {
            addCriterion("twophone not in", values, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneBetween(String value1, String value2) {
            addCriterion("twophone between", value1, value2, "twophone");
            return (Criteria) this;
        }

        public Criteria andTwophoneNotBetween(String value1, String value2) {
            addCriterion("twophone not between", value1, value2, "twophone");
            return (Criteria) this;
        }

        public Criteria andThreenameIsNull() {
            addCriterion("threename is null");
            return (Criteria) this;
        }

        public Criteria andThreenameIsNotNull() {
            addCriterion("threename is not null");
            return (Criteria) this;
        }

        public Criteria andThreenameEqualTo(String value) {
            addCriterion("threename =", value, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameNotEqualTo(String value) {
            addCriterion("threename <>", value, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameGreaterThan(String value) {
            addCriterion("threename >", value, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameGreaterThanOrEqualTo(String value) {
            addCriterion("threename >=", value, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameLessThan(String value) {
            addCriterion("threename <", value, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameLessThanOrEqualTo(String value) {
            addCriterion("threename <=", value, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameLike(String value) {
            addCriterion("threename like", value, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameNotLike(String value) {
            addCriterion("threename not like", value, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameIn(List<String> values) {
            addCriterion("threename in", values, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameNotIn(List<String> values) {
            addCriterion("threename not in", values, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameBetween(String value1, String value2) {
            addCriterion("threename between", value1, value2, "threename");
            return (Criteria) this;
        }

        public Criteria andThreenameNotBetween(String value1, String value2) {
            addCriterion("threename not between", value1, value2, "threename");
            return (Criteria) this;
        }

        public Criteria andThreeclassIsNull() {
            addCriterion("threeclass is null");
            return (Criteria) this;
        }

        public Criteria andThreeclassIsNotNull() {
            addCriterion("threeclass is not null");
            return (Criteria) this;
        }

        public Criteria andThreeclassEqualTo(String value) {
            addCriterion("threeclass =", value, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassNotEqualTo(String value) {
            addCriterion("threeclass <>", value, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassGreaterThan(String value) {
            addCriterion("threeclass >", value, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassGreaterThanOrEqualTo(String value) {
            addCriterion("threeclass >=", value, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassLessThan(String value) {
            addCriterion("threeclass <", value, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassLessThanOrEqualTo(String value) {
            addCriterion("threeclass <=", value, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassLike(String value) {
            addCriterion("threeclass like", value, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassNotLike(String value) {
            addCriterion("threeclass not like", value, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassIn(List<String> values) {
            addCriterion("threeclass in", values, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassNotIn(List<String> values) {
            addCriterion("threeclass not in", values, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassBetween(String value1, String value2) {
            addCriterion("threeclass between", value1, value2, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreeclassNotBetween(String value1, String value2) {
            addCriterion("threeclass not between", value1, value2, "threeclass");
            return (Criteria) this;
        }

        public Criteria andThreephoneIsNull() {
            addCriterion("threephone is null");
            return (Criteria) this;
        }

        public Criteria andThreephoneIsNotNull() {
            addCriterion("threephone is not null");
            return (Criteria) this;
        }

        public Criteria andThreephoneEqualTo(String value) {
            addCriterion("threephone =", value, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneNotEqualTo(String value) {
            addCriterion("threephone <>", value, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneGreaterThan(String value) {
            addCriterion("threephone >", value, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneGreaterThanOrEqualTo(String value) {
            addCriterion("threephone >=", value, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneLessThan(String value) {
            addCriterion("threephone <", value, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneLessThanOrEqualTo(String value) {
            addCriterion("threephone <=", value, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneLike(String value) {
            addCriterion("threephone like", value, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneNotLike(String value) {
            addCriterion("threephone not like", value, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneIn(List<String> values) {
            addCriterion("threephone in", values, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneNotIn(List<String> values) {
            addCriterion("threephone not in", values, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneBetween(String value1, String value2) {
            addCriterion("threephone between", value1, value2, "threephone");
            return (Criteria) this;
        }

        public Criteria andThreephoneNotBetween(String value1, String value2) {
            addCriterion("threephone not between", value1, value2, "threephone");
            return (Criteria) this;
        }

        public Criteria andFournameIsNull() {
            addCriterion("fourname is null");
            return (Criteria) this;
        }

        public Criteria andFournameIsNotNull() {
            addCriterion("fourname is not null");
            return (Criteria) this;
        }

        public Criteria andFournameEqualTo(String value) {
            addCriterion("fourname =", value, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameNotEqualTo(String value) {
            addCriterion("fourname <>", value, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameGreaterThan(String value) {
            addCriterion("fourname >", value, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameGreaterThanOrEqualTo(String value) {
            addCriterion("fourname >=", value, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameLessThan(String value) {
            addCriterion("fourname <", value, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameLessThanOrEqualTo(String value) {
            addCriterion("fourname <=", value, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameLike(String value) {
            addCriterion("fourname like", value, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameNotLike(String value) {
            addCriterion("fourname not like", value, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameIn(List<String> values) {
            addCriterion("fourname in", values, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameNotIn(List<String> values) {
            addCriterion("fourname not in", values, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameBetween(String value1, String value2) {
            addCriterion("fourname between", value1, value2, "fourname");
            return (Criteria) this;
        }

        public Criteria andFournameNotBetween(String value1, String value2) {
            addCriterion("fourname not between", value1, value2, "fourname");
            return (Criteria) this;
        }

        public Criteria andFourclassIsNull() {
            addCriterion("fourclass is null");
            return (Criteria) this;
        }

        public Criteria andFourclassIsNotNull() {
            addCriterion("fourclass is not null");
            return (Criteria) this;
        }

        public Criteria andFourclassEqualTo(String value) {
            addCriterion("fourclass =", value, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassNotEqualTo(String value) {
            addCriterion("fourclass <>", value, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassGreaterThan(String value) {
            addCriterion("fourclass >", value, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassGreaterThanOrEqualTo(String value) {
            addCriterion("fourclass >=", value, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassLessThan(String value) {
            addCriterion("fourclass <", value, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassLessThanOrEqualTo(String value) {
            addCriterion("fourclass <=", value, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassLike(String value) {
            addCriterion("fourclass like", value, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassNotLike(String value) {
            addCriterion("fourclass not like", value, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassIn(List<String> values) {
            addCriterion("fourclass in", values, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassNotIn(List<String> values) {
            addCriterion("fourclass not in", values, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassBetween(String value1, String value2) {
            addCriterion("fourclass between", value1, value2, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourclassNotBetween(String value1, String value2) {
            addCriterion("fourclass not between", value1, value2, "fourclass");
            return (Criteria) this;
        }

        public Criteria andFourphoneIsNull() {
            addCriterion("fourphone is null");
            return (Criteria) this;
        }

        public Criteria andFourphoneIsNotNull() {
            addCriterion("fourphone is not null");
            return (Criteria) this;
        }

        public Criteria andFourphoneEqualTo(String value) {
            addCriterion("fourphone =", value, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneNotEqualTo(String value) {
            addCriterion("fourphone <>", value, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneGreaterThan(String value) {
            addCriterion("fourphone >", value, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneGreaterThanOrEqualTo(String value) {
            addCriterion("fourphone >=", value, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneLessThan(String value) {
            addCriterion("fourphone <", value, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneLessThanOrEqualTo(String value) {
            addCriterion("fourphone <=", value, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneLike(String value) {
            addCriterion("fourphone like", value, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneNotLike(String value) {
            addCriterion("fourphone not like", value, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneIn(List<String> values) {
            addCriterion("fourphone in", values, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneNotIn(List<String> values) {
            addCriterion("fourphone not in", values, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneBetween(String value1, String value2) {
            addCriterion("fourphone between", value1, value2, "fourphone");
            return (Criteria) this;
        }

        public Criteria andFourphoneNotBetween(String value1, String value2) {
            addCriterion("fourphone not between", value1, value2, "fourphone");
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