package com.speedycomm.erp.pm.core;

import com.speedycomm.erp.fw.core.BaseInfo;
import com.speedycomm.erp.pm.UserType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 2015/12/21.
 */
@Entity
@Table(name = "T_PM_User")
public class User extends BaseInfo {

    private static final long serialVersionUID = -2820740737805499494L;

    @Column(name = "FEMail", length = 64)
    private String eMail;

    @Column(name = "FPhone", length = 32)
    private String phone;

    @Column(name = "FMobile", length = 32)
    private String mobile;

    @Column(name = "FPassword", length = 64)
    private String password;

    @Column(name = "FUserType")
    private UserType userType;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
