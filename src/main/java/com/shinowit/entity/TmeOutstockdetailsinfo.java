package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TmeOutstockdetailsinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockDetailsInfo.ID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockDetailsInfo.Num
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockDetailsInfo.Price
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockDetailsInfo.stock_price
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private BigDecimal stockPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockDetailsInfo.MerchandiseID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private Integer merchandiseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TMe_OutStockDetailsInfo.OutBillCode
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private Integer outbillcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockDetailsInfo.ID
     *
     * @return the value of TMe_OutStockDetailsInfo.ID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockDetailsInfo.ID
     *
     * @param id the value for TMe_OutStockDetailsInfo.ID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockDetailsInfo.Num
     *
     * @return the value of TMe_OutStockDetailsInfo.Num
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockDetailsInfo.Num
     *
     * @param num the value for TMe_OutStockDetailsInfo.Num
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockDetailsInfo.Price
     *
     * @return the value of TMe_OutStockDetailsInfo.Price
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockDetailsInfo.Price
     *
     * @param price the value for TMe_OutStockDetailsInfo.Price
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockDetailsInfo.stock_price
     *
     * @return the value of TMe_OutStockDetailsInfo.stock_price
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public BigDecimal getStockPrice() {
        return stockPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockDetailsInfo.stock_price
     *
     * @param stockPrice the value for TMe_OutStockDetailsInfo.stock_price
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public void setStockPrice(BigDecimal stockPrice) {
        this.stockPrice = stockPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockDetailsInfo.MerchandiseID
     *
     * @return the value of TMe_OutStockDetailsInfo.MerchandiseID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public Integer getMerchandiseid() {
        return merchandiseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockDetailsInfo.MerchandiseID
     *
     * @param merchandiseid the value for TMe_OutStockDetailsInfo.MerchandiseID
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public void setMerchandiseid(Integer merchandiseid) {
        this.merchandiseid = merchandiseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TMe_OutStockDetailsInfo.OutBillCode
     *
     * @return the value of TMe_OutStockDetailsInfo.OutBillCode
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public Integer getOutbillcode() {
        return outbillcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TMe_OutStockDetailsInfo.OutBillCode
     *
     * @param outbillcode the value for TMe_OutStockDetailsInfo.OutBillCode
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    public void setOutbillcode(Integer outbillcode) {
        this.outbillcode = outbillcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
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
        TmeOutstockdetailsinfo other = (TmeOutstockdetailsinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getStockPrice() == null ? other.getStockPrice() == null : this.getStockPrice().equals(other.getStockPrice()))
            && (this.getMerchandiseid() == null ? other.getMerchandiseid() == null : this.getMerchandiseid().equals(other.getMerchandiseid()))
            && (this.getOutbillcode() == null ? other.getOutbillcode() == null : this.getOutbillcode().equals(other.getOutbillcode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_OutStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 18:41:32 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getStockPrice() == null) ? 0 : getStockPrice().hashCode());
        result = prime * result + ((getMerchandiseid() == null) ? 0 : getMerchandiseid().hashCode());
        result = prime * result + ((getOutbillcode() == null) ? 0 : getOutbillcode().hashCode());
        return result;
    }
}