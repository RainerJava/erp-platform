package com.speedycomm.erp.pm.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 15/12/29.
 * 用户权限
 */
@Entity
@Table(name = "T_PM_Authority")
public class Authority extends BaseInfo {

    private static final long serialVersionUID = 3229820623035812066L;

    @Column(name = "FName", nullable = false, length = 32)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
