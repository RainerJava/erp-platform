package com.speedycomm.erp.org.core;

import com.speedycomm.erp.fw.core.BaseUnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 职位关系
 */
@Entity
@Table(name = "T_ORG_Position")
public class PositionRelation extends BaseUnitRelation {

    private static final long serialVersionUID = 4916142977907535804L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FItemID")
    private Position item;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private Position parent;

    public Position getItem() {
        return item;
    }

    public void setItem(Position item) {
        this.item = item;
    }

    public Position getParent() {
        return parent;
    }

    public void setParent(Position parent) {
        this.parent = parent;
    }

}
