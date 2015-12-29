package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseUnit;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/22.
 */
@Entity
@Table(name = "T_BD_Contacts")
public class Contacts extends BaseUnit {

    private static final long serialVersionUID = 4328156676822049749L;

    @Column(name = "FEMail", length = 64)
    private String email;

    @Column(name = "FPhone", length = 32)
    private String phone;

    @Column(name = "FMobile", length = 32)
    private String mobile;

    /*
     *税务号
     */
    @Column(name = "FTaxNumber")
    private String taxNumber;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FAddressID")
    private Address address;

    public String getEmail() {
        return email;
    }

    public void setEmail(String eMail) {
        this.email = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
