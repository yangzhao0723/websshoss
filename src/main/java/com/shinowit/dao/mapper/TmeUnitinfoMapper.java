package com.shinowit.dao.mapper;

import com.shinowit.entity.TmeUnitinfo;
import com.shinowit.entity.TmeUnitinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeUnitinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int countByExample(TmeUnitinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int deleteByExample(TmeUnitinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int deleteByPrimaryKey(Integer unitid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int insert(TmeUnitinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int insertSelective(TmeUnitinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    List<TmeUnitinfo> selectByExample(TmeUnitinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    TmeUnitinfo selectByPrimaryKey(Integer unitid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int updateByExampleSelective(@Param("record") TmeUnitinfo record, @Param("example") TmeUnitinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int updateByExample(@Param("record") TmeUnitinfo record, @Param("example") TmeUnitinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int updateByPrimaryKeySelective(TmeUnitinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int updateByPrimaryKey(TmeUnitinfo record);

    List<TmeUnitinfo> selectPage(TmeUnitinfoCriteria example);

    Integer selectMaxPrimaryKeyValue();
}