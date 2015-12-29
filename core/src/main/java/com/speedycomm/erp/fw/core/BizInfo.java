package com.speedycomm.erp.fw.core;

import com.speedycomm.erp.fw.UuidEntity;
import com.speedycomm.erp.org.core.ControlUnit;
import com.speedycomm.erp.org.core.Organization;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/18.
 * 业务数据
 */
@MappedSuperclass
public abstract class BizInfo extends UuidEntity {

    private static final long serialVersionUID = 4337453038067165845L;

    @Column(name = "FIsFinished")
    private boolean finished;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FOrganizationID")
    private Organization organization;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FControlUnitID")
    private ControlUnit controlUnit;

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

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
