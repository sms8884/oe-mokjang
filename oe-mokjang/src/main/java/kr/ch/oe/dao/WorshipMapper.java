package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.Worship;
import kr.ch.oe.model.WorshipExample;
import org.apache.ibatis.annotations.Param;

public interface WorshipMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	int countByExample(WorshipExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	int deleteByExample(WorshipExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	int deleteByPrimaryKey(Integer worshipSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	int insert(Worship record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	int insertSelective(Worship record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	List<Worship> selectByExample(WorshipExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	Worship selectByPrimaryKey(Integer worshipSeq);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	int updateByExampleSelective(@Param("record") Worship record,
			@Param("example") WorshipExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	int updateByExample(@Param("record") Worship record,
			@Param("example") WorshipExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	int updateByPrimaryKeySelective(Worship record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table worship
	 * @mbggenerated  Sun Jun 14 14:33:40 KST 2015
	 */
	int updateByPrimaryKey(Worship record);
}