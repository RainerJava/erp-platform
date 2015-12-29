package com.speedycomm.erp.fw.core;

import com.speedycomm.erp.fw.IDEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by linjietao on 15/12/29.
 * 基础单元关系
 */
@MappedSuperclass
public abstract class BaseUnitRelation extends IDEntity {

    private static final long serialVersionUID = -3288847431639633788L;

    @Column(name = "FNumber", length = 128)
    private String number;

    @Column(name = "FPrimary")
    private boolean primary;

    /**
     * 获得实体的查询编码
     *
     * @return 叶子实体的长编码
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置实体的查询编码
     *
     * @param number 要设置的实体查询编码
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获得实体的是否是根节点缺省设置
     *
     * @return 叶子实体的长编码
     */
    public boolean isPrimary() {
        return primary;
    }

    /**
     * 设置叶子实体的是根节点缺省设置
     *
     * @param primary 要设置的实体是根节点缺省设置
     */
    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

}
