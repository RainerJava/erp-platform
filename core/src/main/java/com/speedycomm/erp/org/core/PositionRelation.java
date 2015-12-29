package com.speedycomm.erp.org.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 职位关系
 */
@Entity
@Table(name = "T_ORG_Position")
public class PositionRelation extends UnitRelation {

    private static final long serialVersionUID = 4916142977907535804L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FChildID")
    private Position child;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private Position parent;

    public Position getChild() {
        return child;
    }

    public void setChild(Position child) {
        this.child = child;
    }

    public Position getParent() {
        return parent;
    }

    public void setParent(Position parent) {
        this.parent = parent;
    }

}
