package kr.ch.oe.model;

import java.util.Date;

public class Edu {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.edu_seq
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	private Long eduSeq;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.edu_name
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	private String eduName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.total_unit
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	private Integer totalUnit;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.reg_id
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	private String regId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column edu.reg_time
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	private Date regTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.edu_seq
	 * @return  the value of edu.edu_seq
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public Long getEduSeq() {
		return eduSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.edu_seq
	 * @param eduSeq  the value for edu.edu_seq
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public void setEduSeq(Long eduSeq) {
		this.eduSeq = eduSeq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.edu_name
	 * @return  the value of edu.edu_name
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public String getEduName() {
		return eduName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.edu_name
	 * @param eduName  the value for edu.edu_name
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public void setEduName(String eduName) {
		this.eduName = eduName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.total_unit
	 * @return  the value of edu.total_unit
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public Integer getTotalUnit() {
		return totalUnit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.total_unit
	 * @param totalUnit  the value for edu.total_unit
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public void setTotalUnit(Integer totalUnit) {
		this.totalUnit = totalUnit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.reg_id
	 * @return  the value of edu.reg_id
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public String getRegId() {
		return regId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.reg_id
	 * @param regId  the value for edu.reg_id
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public void setRegId(String regId) {
		this.regId = regId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column edu.reg_time
	 * @return  the value of edu.reg_time
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public Date getRegTime() {
		return regTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column edu.reg_time
	 * @param regTime  the value for edu.reg_time
	 * @mbggenerated  Sun Jun 14 14:36:54 KST 2015
	 */
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

}