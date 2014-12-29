package com.shinowit.dao.mapper;

import com.shinowit.entity.TbaMembeaddrinfo;
import com.shinowit.entity.TbaMembeaddrinfoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbaMembeaddrinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int countByExample(TbaMembeaddrinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int deleteByExample(TbaMembeaddrinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int insert(TbaMembeaddrinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int insertSelective(TbaMembeaddrinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    List<TbaMembeaddrinfo> selectByExample(TbaMembeaddrinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    TbaMembeaddrinfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int updateByExampleSelective(@Param("record") TbaMembeaddrinfo record, @Param("example") TbaMembeaddrinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int updateByExample(@Param("record") TbaMembeaddrinfo record, @Param("example") TbaMembeaddrinfoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int updateByPrimaryKeySelective(TbaMembeaddrinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBa_MembeAddrInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    int updateByPrimaryKey(TbaMembeaddrinfo record);

    List<TbaMembeaddrinfo> selectPage(TbaMembeaddrinfoCriteria example);

    Integer selectMaxPrimaryKeyValue();
}