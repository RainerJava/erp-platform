package com.speedycomm.erp.pm.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 角色关系
 */
@Entity
@Table(name = "T_PM_RoleRelation")
public class RoleRelation extends UnitRelation {

    private static final long serialVersionUID = -3186087484747434288L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FChildID")
    private Role child;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private Role parent;

    public Role getChild() {
        return child;
    }

    public void setChild(Role child) {
        this.child = child;
    }

    public Role getParent() {
        return parent;
    }

    public void setParent(Role parent) {
        this.parent = parent;
    }
}
