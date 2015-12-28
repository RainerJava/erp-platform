package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/21.
 */
@Entity
@Table(name = "T_BD_Province")
public class Province extends BaseInfo {

    private static final long serialVersionUID = -3863504374830483392L;

    @Column(name = "FZipCode", length = 16)
    private String zipCode;

    @Column(name = "FTelephoneCode", length = 16)
    private String telephoneCode;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FCountryID")
    private Country country;

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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
