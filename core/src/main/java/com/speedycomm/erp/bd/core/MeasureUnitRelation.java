package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseUnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 计量单位关系表
 */
@Entity
@Table(name = "T_BD_MaterialRelation")
public class MeasureUnitRelation extends BaseUnitRelation {

    private static final long serialVersionUID = 3979045150089427045L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FItemID")
    private Material item;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private Material parent;

    public Material getItem() {
        return item;
    }

    public void setItem(Material item) {
        this.item = item;
    }

    public Material getParent() {
        return parent;
    }

    public void setParent(Material parent) {
        this.parent = parent;
    }
}
