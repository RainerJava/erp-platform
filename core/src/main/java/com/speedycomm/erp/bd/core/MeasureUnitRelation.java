package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 计量单位关系表
 */
@Entity
@Table(name = "T_BD_MaterialRelation")
public class MeasureUnitRelation extends UnitRelation {

    private static final long serialVersionUID = 3979045150089427045L;

    @Column(name = "FRate", scale = 3)
    private double rate;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FChildID")
    private Material child;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private Material parent;

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

    public Material getChild() {
        return child;
    }

    public void setChild(Material child) {
        this.child = child;
    }

    public Material getParent() {
        return parent;
    }

    public void setParent(Material parent) {
        this.parent = parent;
    }
}
