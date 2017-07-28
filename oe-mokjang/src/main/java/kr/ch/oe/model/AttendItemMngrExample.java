package kr.ch.oe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AttendItemMngrExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    public AttendItemMngrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAttendItemMngrSeqIsNull() {
            addCriterion("attend_item_mngr_seq is null");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqIsNotNull() {
            addCriterion("attend_item_mngr_seq is not null");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqEqualTo(Long value) {
            addCriterion("attend_item_mngr_seq =", value, "attendItemMngrSeq");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqNotEqualTo(Long value) {
            addCriterion("attend_item_mngr_seq <>", value, "attendItemMngrSeq");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqGreaterThan(Long value) {
            addCriterion("attend_item_mngr_seq >", value, "attendItemMngrSeq");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("attend_item_mngr_seq >=", value, "attendItemMngrSeq");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqLessThan(Long value) {
            addCriterion("attend_item_mngr_seq <", value, "attendItemMngrSeq");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqLessThanOrEqualTo(Long value) {
            addCriterion("attend_item_mngr_seq <=", value, "attendItemMngrSeq");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqIn(List<Long> values) {
            addCriterion("attend_item_mngr_seq in", values, "attendItemMngrSeq");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqNotIn(List<Long> values) {
            addCriterion("attend_item_mngr_seq not in", values, "attendItemMngrSeq");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqBetween(Long value1, Long value2) {
            addCriterion("attend_item_mngr_seq between", value1, value2, "attendItemMngrSeq");
            return (Criteria) this;
        }

        public Criteria andAttendItemMngrSeqNotBetween(Long value1, Long value2) {
            addCriterion("attend_item_mngr_seq not between", value1, value2, "attendItemMngrSeq");
            return (Criteria) this;
        }

        public Criteria andMngrNameIsNull() {
            addCriterion("mngr_name is null");
            return (Criteria) this;
        }

        public Criteria andMngrNameIsNotNull() {
            addCriterion("mngr_name is not null");
            return (Criteria) this;
        }

        public Criteria andMngrNameEqualTo(String value) {
            addCriterion("mngr_name =", value, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameNotEqualTo(String value) {
            addCriterion("mngr_name <>", value, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameGreaterThan(String value) {
            addCriterion("mngr_name >", value, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameGreaterThanOrEqualTo(String value) {
            addCriterion("mngr_name >=", value, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameLessThan(String value) {
            addCriterion("mngr_name <", value, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameLessThanOrEqualTo(String value) {
            addCriterion("mngr_name <=", value, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameLike(String value) {
            addCriterion("mngr_name like", value, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameNotLike(String value) {
            addCriterion("mngr_name not like", value, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameIn(List<String> values) {
            addCriterion("mngr_name in", values, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameNotIn(List<String> values) {
            addCriterion("mngr_name not in", values, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameBetween(String value1, String value2) {
            addCriterion("mngr_name between", value1, value2, "mngrName");
            return (Criteria) this;
        }

        public Criteria andMngrNameNotBetween(String value1, String value2) {
            addCriterion("mngr_name not between", value1, value2, "mngrName");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNull() {
            addCriterion("use_yn is null");
            return (Criteria) this;
        }

        public Criteria andUseYnIsNotNull() {
            addCriterion("use_yn is not null");
            return (Criteria) this;
        }

        public Criteria andUseYnEqualTo(String value) {
            addCriterion("use_yn =", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotEqualTo(String value) {
            addCriterion("use_yn <>", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThan(String value) {
            addCriterion("use_yn >", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnGreaterThanOrEqualTo(String value) {
            addCriterion("use_yn >=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThan(String value) {
            addCriterion("use_yn <", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLessThanOrEqualTo(String value) {
            addCriterion("use_yn <=", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnLike(String value) {
            addCriterion("use_yn like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotLike(String value) {
            addCriterion("use_yn not like", value, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnIn(List<String> values) {
            addCriterion("use_yn in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotIn(List<String> values) {
            addCriterion("use_yn not in", values, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnBetween(String value1, String value2) {
            addCriterion("use_yn between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andUseYnNotBetween(String value1, String value2) {
            addCriterion("use_yn not between", value1, value2, "useYn");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("reg_id is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("reg_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(String value) {
            addCriterion("reg_id =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(String value) {
            addCriterion("reg_id <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(String value) {
            addCriterion("reg_id >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_id >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(String value) {
            addCriterion("reg_id <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(String value) {
            addCriterion("reg_id <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLike(String value) {
            addCriterion("reg_id like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotLike(String value) {
            addCriterion("reg_id not like", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<String> values) {
            addCriterion("reg_id in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<String> values) {
            addCriterion("reg_id not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(String value1, String value2) {
            addCriterion("reg_id between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(String value1, String value2) {
            addCriterion("reg_id not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table attend_item_mngr
     *
     * @mbggenerated do_not_delete_during_merge Sun Jun 21 17:35:04 KST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table attend_item_mngr
     *
     * @mbggenerated Sun Jun 21 17:35:04 KST 2015
     */
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