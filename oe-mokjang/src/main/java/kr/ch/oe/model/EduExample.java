package kr.ch.oe.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class EduExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public EduExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andEduSeqIsNull() {
			addCriterion("edu_seq is null");
			return (Criteria) this;
		}

		public Criteria andEduSeqIsNotNull() {
			addCriterion("edu_seq is not null");
			return (Criteria) this;
		}

		public Criteria andEduSeqEqualTo(Long value) {
			addCriterion("edu_seq =", value, "eduSeq");
			return (Criteria) this;
		}

		public Criteria andEduSeqNotEqualTo(Long value) {
			addCriterion("edu_seq <>", value, "eduSeq");
			return (Criteria) this;
		}

		public Criteria andEduSeqGreaterThan(Long value) {
			addCriterion("edu_seq >", value, "eduSeq");
			return (Criteria) this;
		}

		public Criteria andEduSeqGreaterThanOrEqualTo(Long value) {
			addCriterion("edu_seq >=", value, "eduSeq");
			return (Criteria) this;
		}

		public Criteria andEduSeqLessThan(Long value) {
			addCriterion("edu_seq <", value, "eduSeq");
			return (Criteria) this;
		}

		public Criteria andEduSeqLessThanOrEqualTo(Long value) {
			addCriterion("edu_seq <=", value, "eduSeq");
			return (Criteria) this;
		}

		public Criteria andEduSeqIn(List<Long> values) {
			addCriterion("edu_seq in", values, "eduSeq");
			return (Criteria) this;
		}

		public Criteria andEduSeqNotIn(List<Long> values) {
			addCriterion("edu_seq not in", values, "eduSeq");
			return (Criteria) this;
		}

		public Criteria andEduSeqBetween(Long value1, Long value2) {
			addCriterion("edu_seq between", value1, value2, "eduSeq");
			return (Criteria) this;
		}

		public Criteria andEduSeqNotBetween(Long value1, Long value2) {
			addCriterion("edu_seq not between", value1, value2, "eduSeq");
			return (Criteria) this;
		}

		public Criteria andEduNameIsNull() {
			addCriterion("edu_name is null");
			return (Criteria) this;
		}

		public Criteria andEduNameIsNotNull() {
			addCriterion("edu_name is not null");
			return (Criteria) this;
		}

		public Criteria andEduNameEqualTo(String value) {
			addCriterion("edu_name =", value, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameNotEqualTo(String value) {
			addCriterion("edu_name <>", value, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameGreaterThan(String value) {
			addCriterion("edu_name >", value, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameGreaterThanOrEqualTo(String value) {
			addCriterion("edu_name >=", value, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameLessThan(String value) {
			addCriterion("edu_name <", value, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameLessThanOrEqualTo(String value) {
			addCriterion("edu_name <=", value, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameLike(String value) {
			addCriterion("edu_name like", value, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameNotLike(String value) {
			addCriterion("edu_name not like", value, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameIn(List<String> values) {
			addCriterion("edu_name in", values, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameNotIn(List<String> values) {
			addCriterion("edu_name not in", values, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameBetween(String value1, String value2) {
			addCriterion("edu_name between", value1, value2, "eduName");
			return (Criteria) this;
		}

		public Criteria andEduNameNotBetween(String value1, String value2) {
			addCriterion("edu_name not between", value1, value2, "eduName");
			return (Criteria) this;
		}

		public Criteria andTotalUnitIsNull() {
			addCriterion("total_unit is null");
			return (Criteria) this;
		}

		public Criteria andTotalUnitIsNotNull() {
			addCriterion("total_unit is not null");
			return (Criteria) this;
		}

		public Criteria andTotalUnitEqualTo(Integer value) {
			addCriterion("total_unit =", value, "totalUnit");
			return (Criteria) this;
		}

		public Criteria andTotalUnitNotEqualTo(Integer value) {
			addCriterion("total_unit <>", value, "totalUnit");
			return (Criteria) this;
		}

		public Criteria andTotalUnitGreaterThan(Integer value) {
			addCriterion("total_unit >", value, "totalUnit");
			return (Criteria) this;
		}

		public Criteria andTotalUnitGreaterThanOrEqualTo(Integer value) {
			addCriterion("total_unit >=", value, "totalUnit");
			return (Criteria) this;
		}

		public Criteria andTotalUnitLessThan(Integer value) {
			addCriterion("total_unit <", value, "totalUnit");
			return (Criteria) this;
		}

		public Criteria andTotalUnitLessThanOrEqualTo(Integer value) {
			addCriterion("total_unit <=", value, "totalUnit");
			return (Criteria) this;
		}

		public Criteria andTotalUnitIn(List<Integer> values) {
			addCriterion("total_unit in", values, "totalUnit");
			return (Criteria) this;
		}

		public Criteria andTotalUnitNotIn(List<Integer> values) {
			addCriterion("total_unit not in", values, "totalUnit");
			return (Criteria) this;
		}

		public Criteria andTotalUnitBetween(Integer value1, Integer value2) {
			addCriterion("total_unit between", value1, value2, "totalUnit");
			return (Criteria) this;
		}

		public Criteria andTotalUnitNotBetween(Integer value1, Integer value2) {
			addCriterion("total_unit not between", value1, value2, "totalUnit");
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table edu
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table edu
     *
     * @mbggenerated do_not_delete_during_merge Thu Jan 08 10:11:30 KST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}