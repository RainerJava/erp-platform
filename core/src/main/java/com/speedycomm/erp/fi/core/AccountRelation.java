package com.speedycomm.erp.fi.core;

import com.speedycomm.erp.fw.core.BaseUnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 */
@Entity
@Table(name = "T_FI_AccountRelation")
public class AccountRelation extends BaseUnitRelation {

    private static final long serialVersionUID = -952391856265837137L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FItemID")
    private Account item;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private Account parent;

    public Account getItem() {
        return item;
    }

    public void setItem(Account item) {
        this.item = item;
    }

    public Account getParent() {
        return parent;
    }

    public void setParent(Account parent) {
        this.parent = parent;
    }
}
