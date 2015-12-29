package com.speedycomm.erp.org.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 15/12/29.
 * 控制单元
 */
@Entity
@Table(name = "T_ORG_ControlUnit")
public class ControlUnit extends BaseInfo {

    private static final long serialVersionUID = -9075229429919228341L;

    @Column(name = "FIsEnabled")
    private boolean enabled;

    @Column(name = "FIsSealUp")
    private boolean sealUp;

    public boolean isSealUp() {
        return sealUp;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setSealUp(boolean sealUp) {
        this.sealUp = sealUp;
    }
}
