package com.speedycomm.erp.fw.core;

import com.speedycomm.erp.org.core.ControlUnit;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 基础单元
 */
@MappedSuperclass
public abstract class BaseUnit extends BaseInfo {

    private static final long serialVersionUID = -2745135025881186192L;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FControlUnitID")
    private ControlUnit controlUnit;

    public ControlUnit getControlUnit() {
        return controlUnit;
    }

    public void setControlUnit(ControlUnit controlUnit) {
        this.controlUnit = controlUnit;
    }
}
