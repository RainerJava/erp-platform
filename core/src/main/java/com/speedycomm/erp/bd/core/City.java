package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/21.
 * 行政单位市/直辖市
 */
@Entity
@Table(name = "T_BD_City")
public class City extends BaseInfo {
    private static final long serialVersionUID = -3871759868369467239L;

    @Column(name = "FZipCode", length = 16)
    private String zipCode;

    @Column(name = "FTelephoneCode", length = 16)
    private String telephoneCode;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FCountryID")
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FProvinceID")
    private Province province;

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

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
