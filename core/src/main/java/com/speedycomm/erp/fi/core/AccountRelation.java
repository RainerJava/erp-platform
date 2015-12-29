package com.speedycomm.erp.fi.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 */
@Entity
@Table(name = "T_FI_AccountRelation")
public class AccountRelation extends UnitRelation {

    private static final long serialVersionUID = -952391856265837137L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FChildID")
    private Account child;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private Account parent;

    public Account getChild() {
        return child;
    }

    public void setChild(Account child) {
        this.child = child;
    }

    public Account getParent() {
        return parent;
    }

    public void setParent(Account parent) {
        this.parent = parent;
    }
}
