package com.speedycomm.erp.rs.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 资源关系
 */
@Entity
@Table(name = "T_RS_ResourceRelation")
public class ResourceRelation extends UnitRelation {

    private static final long serialVersionUID = 397816850082538729L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FChildID")
    private Resource child;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FParentID")
    private Resource parent;

    public Resource getChild() {
        return child;
    }

    public void setChild(Resource child) {
        this.child = child;
    }

    public Resource getParent() {
        return parent;
    }

    public void setParent(Resource parent) {
        this.parent = parent;
    }
}
