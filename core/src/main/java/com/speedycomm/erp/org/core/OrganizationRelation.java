package com.speedycomm.erp.org.core;

import com.speedycomm.erp.fw.core.BaseUnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 组织单元上下级关系
 */
@Entity
@Table(name = "T_ORG_OrganizationRelation")
public class OrganizationRelation extends BaseUnitRelation {

    private static final long serialVersionUID = 8825937379632162031L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FItemID")
    private Organization item;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private Organization parent;

    public Organization getItem() {
        return item;
    }

    public void setItem(Organization item) {
        this.item = item;
    }

    public Organization getParent() {
        return parent;
    }

    public void setParent(Organization parent) {
        this.parent = parent;
    }
}
