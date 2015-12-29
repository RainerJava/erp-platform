package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseUnit;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/22.
 * 银行账户
 */
@Entity
@Table(name = "T_BD_BankAccount")
public class BankAccount extends BaseUnit {

    private static final long serialVersionUID = 6319507546429044518L;

    @Column(name = "FAccount", nullable = false, length = 32)
    private String account;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FBankID")
    private Bank bank;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

}
