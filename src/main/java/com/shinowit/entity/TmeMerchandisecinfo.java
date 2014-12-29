package com.shinowit.entity;

import java.io.Serializable;

public class TmeMerchandisecinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseCInfo.MerchandiseCID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private Integer merchandisecid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseCInfo.MerchandiseCName
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private String merchandisecname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseCInfo.SortID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private Integer sortid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_MerchandiseCInfo.State
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private Boolean state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseCInfo.MerchandiseCID
     *
     * @return the value of TMe_MerchandiseCInfo.MerchandiseCID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public Integer getMerchandisecid() {
        return merchandisecid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseCInfo.MerchandiseCID
     *
     * @param merchandisecid the value for TMe_MerchandiseCInfo.MerchandiseCID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public void setMerchandisecid(Integer merchandisecid) {
        this.merchandisecid = merchandisecid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseCInfo.MerchandiseCName
     *
     * @return the value of TMe_MerchandiseCInfo.MerchandiseCName
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public String getMerchandisecname() {
        return merchandisecname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseCInfo.MerchandiseCName
     *
     * @param merchandisecname the value for TMe_MerchandiseCInfo.MerchandiseCName
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public void setMerchandisecname(String merchandisecname) {
        this.merchandisecname = merchandisecname == null ? null : merchandisecname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseCInfo.SortID
     *
     * @return the value of TMe_MerchandiseCInfo.SortID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public Integer getSortid() {
        return sortid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseCInfo.SortID
     *
     * @param sortid the value for TMe_MerchandiseCInfo.SortID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_MerchandiseCInfo.State
     *
     * @return the value of TMe_MerchandiseCInfo.State
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public Boolean getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_MerchandiseCInfo.State
     *
     * @param state the value for TMe_MerchandiseCInfo.State
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TmeMerchandisecinfo other = (TmeMerchandisecinfo) that;
        return (this.getMerchandisecid() == null ? other.getMerchandisecid() == null : this.getMerchandisecid().equals(other.getMerchandisecid()))
            && (this.getMerchandisecname() == null ? other.getMerchandisecname() == null : this.getMerchandisecname().equals(other.getMerchandisecname()))
            && (this.getSortid() == null ? other.getSortid() == null : this.getSortid().equals(other.getSortid()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMerchandisecid() == null) ? 0 : getMerchandisecid().hashCode());
        result = prime * result + ((getMerchandisecname() == null) ? 0 : getMerchandisecname().hashCode());
        result = prime * result + ((getSortid() == null) ? 0 : getSortid().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }
}