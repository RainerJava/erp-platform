package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 2015/12/21.
 * 行政单位国家
 */
@Entity
@Table(name = "T_BD_Country")
public class Country extends BaseInfo {

    private static final long serialVersionUID = -4503133102158915728L;

    @Column(name = "FZipCode", length = 16)
    private String zipCode;

    @Column(name = "FTelephoneCode", length = 16)
    private String telephoneCode;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getTelephoneCode() {
        return telephoneCode;
    }

    public void setTelephoneCode(String telephoneCode) {
        this.telephoneCode = telephoneCode;
    }
}
