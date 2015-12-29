package com.speedycomm.erp.org.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by linjietao on 15/12/29.
 * 控制单元上下级关系
 */
public class ControlUnitRelation extends UnitRelation {

    private static final long serialVersionUID = 96919938055738538L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FChildID")
    private ControlUnit child;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private ControlUnit parent;

    public ControlUnit getChild() {
        return child;
    }

    public void setChild(ControlUnit child) {
        this.child = child;
    }

    public ControlUnit getParent() {
        return parent;
    }

    public void setParent(ControlUnit parent) {
        this.parent = parent;
    }
}
