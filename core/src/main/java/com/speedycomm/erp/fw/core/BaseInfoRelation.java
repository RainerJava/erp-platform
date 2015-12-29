package com.speedycomm.erp.fw.core;

import com.speedycomm.erp.fw.UuidEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by linjietao on 15/12/29.
 */
@MappedSuperclass
public class BaseInfoRelation extends UuidEntity {

    private static final long serialVersionUID = -3288847431639633788L;

    @Column(name = "FRate", scale = 3)
    private double rate;

    @Column(name = "FItemLongNumber", length = 128)
    private String itemLongNumber;

    @Column(name = "FItemLongNumber", length = 128)
    private String parentLongNumber;

    /**
     * 获得根/叶子实体的换算比例
     *
     * @return 根/叶子实体的换算比例
     */
    public double getRate() {
        return rate;
    }

    /**
     * 设置根/叶子实体的换算比例
     *
     * @param rate 要设置的根/叶子实体换算比例
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * 获得叶子实体的长编码
     *
     * @return 叶子实体的长编码
     */
    public String getItemLongNumber() {
        return itemLongNumber;
    }

    /**
     * 设置叶子实体的长编码
     *
     * @param itemLongNumber 要设置的叶子实体长编码
     */
    public void setItemLongNumber(String itemLongNumber) {
        this.itemLongNumber = itemLongNumber;
    }

    /**
     * 获得根实体的长编码
     *
     * @return 根实体的长编码
     */
    public String getParentLongNumber() {
        return parentLongNumber;
    }

    /**
     * 设置根实体的长编码
     *
     * @param parentLongNumber 要设置的根实体长编码
     */
    public void setParentLongNumber(String parentLongNumber) {
        this.parentLongNumber = parentLongNumber;
    }
}
