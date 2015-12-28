package com.speedycomm.erp.hr.core;

import com.speedycomm.erp.bd.Gender;
import com.speedycomm.erp.bd.core.Address;
import com.speedycomm.erp.fw.core.BaseInfo;
import com.speedycomm.erp.pm.core.User;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/21.
 */
@Entity
@Table(name = "T_HR_Person")
public class Person extends BaseInfo {

    private static final long serialVersionUID = 911854304894999511L;

    @Column(name = "FGender")
    private Gender gender;

    @Column(name = "FEMail", length = 64)
    private String eMail;

    @Column(name = "FPhone", length = 32)
    private String phone;

    @Column(name = "FMobile", length = 32)
    private String mobile;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FUserID")
    private User user;

    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FAddressID")
    private Address address;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
