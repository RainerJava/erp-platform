package com.speedycomm.erp.org.core;

import com.speedycomm.erp.fw.core.BaseUnit;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 职位
 */
@Entity
@Table(name = "T_ORG_Position")
public class Position extends BaseUnit {

    private static final long serialVersionUID = -7127898817907920457L;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FOrganizationID")
    private Organization organization;

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
