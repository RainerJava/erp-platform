package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 15/12/29.
 * 核算项目类型
 */
@Entity
@Table(name = "T_BD_AccountingType")
public class AccountingType extends BaseInfo {
    private static final long serialVersionUID = 8745337130586548069L;

    @Column(name = "FClassName", nullable = false, length = 64)
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
