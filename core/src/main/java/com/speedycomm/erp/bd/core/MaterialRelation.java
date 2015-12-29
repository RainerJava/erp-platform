package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseInfoRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 物料关系表
 */
@Entity
@Table(name = "T_BD_MaterialRelation")
public class MaterialRelation extends BaseInfoRelation {

    private static final long serialVersionUID = -8734428729389824488L;

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
