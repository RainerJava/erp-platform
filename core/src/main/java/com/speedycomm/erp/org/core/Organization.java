package com.speedycomm.erp.org.core;

import com.speedycomm.erp.fw.core.BaseUnit;
import com.speedycomm.erp.org.OrganizationType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Created by linjietao on 15/12/29.
 * 组织单元
 */
@Entity
@Table(name = "T_ORG_Organization")
public class Organization extends BaseUnit {

    private static final long serialVersionUID = 2063745167190312546L;

    @Column(name = "FType")
    private int type;

    @Column(name = "FIsSealUp")
    private boolean sealUp;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isSealUp() {
        return sealUp;
    }

    public void setSealUp(boolean sealUp) {
        this.sealUp = sealUp;
    }

    @Transient
    public boolean equalType(OrganizationType organizationType) {
        return (this.type & organizationType.getValue())==0 ? false: true;
    }
}
