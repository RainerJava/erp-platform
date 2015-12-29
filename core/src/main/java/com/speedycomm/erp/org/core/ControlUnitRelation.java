package com.speedycomm.erp.org.core;

import com.speedycomm.erp.fw.core.BaseInfoRelation;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by linjietao on 15/12/29.
 * 控制单元上下级关系
 */
public class ControlUnitRelation extends BaseInfoRelation {

    private static final long serialVersionUID = 96919938055738538L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FItemID")
    private ControlUnit item;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private ControlUnit parent;

    public ControlUnit getItem() {
        return item;
    }

    public void setItem(ControlUnit item) {
        this.item = item;
    }

    public ControlUnit getParent() {
        return parent;
    }

    public void setParent(ControlUnit parent) {
        this.parent = parent;
    }
}
