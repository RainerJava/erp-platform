package com.speedycomm.erp.fw.core;

import com.speedycomm.erp.org.core.ControlUnit;
import com.speedycomm.erp.org.core.Organization;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 */
@MappedSuperclass
public abstract class BizUnit extends BizInfo {

    private static final long serialVersionUID = -3600530016498273093L;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FOrganizationID")
    private Organization organization;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FControlUnitID")
    private ControlUnit controlUnit;

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public ControlUnit getControlUnit() {
        return controlUnit;
    }

    public void setControlUnit(ControlUnit controlUnit) {
        this.controlUnit = controlUnit;
    }
}
