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

    @Column(name = "FName", length = 64, nullable = false)
    private String name;

    @Column(name = "FNumber", length = 64, nullable = false, unique = true)
    private String number;

    @Column(name = "FSimpleName", length = 32)
    private String simpleName;

    @Column(name = "FDescription")
    private String description;

    @Column(name = "FIsEnabled")
    private boolean enabled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
