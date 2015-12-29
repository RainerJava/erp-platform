package com.speedycomm.erp.fw.core;

import com.speedycomm.erp.fw.UuidEntity;
import com.speedycomm.erp.org.core.ControlUnit;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/18.
 * 基础数据
 */
@MappedSuperclass
public abstract class BaseInfo extends UuidEntity {

    private static final long serialVersionUID = 5837152879736609926L;

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
