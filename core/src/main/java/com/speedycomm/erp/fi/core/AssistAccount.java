package com.speedycomm.erp.fi.core;

import com.speedycomm.erp.fi.BalanceDirection;
import com.speedycomm.erp.fw.core.BaseUnit;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/22.
 * 财务会计辅助帐
 */
@Entity
@Table(name = "T_FI_AssistAccount")
public class AssistAccount extends BaseUnit {

    private static final long serialVersionUID = 1835891858809216026L;

    /*
     * 贷方科目
     */
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FCreditAccount")
    private Account creditAccount;

    /*
     * 借方科目
     */
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FDebitAccount")
    private Account debitAccount;

    /*
     * 余额方向
     */
    @Column(name = "FBalanceDirection")
    private BalanceDirection balanceDirection;

    public Account getCreditAccount() {
        return creditAccount;
    }

    public void setCreditAccount(Account creditAccount) {
        this.creditAccount = creditAccount;
    }

    public Account getDebitAccount() {
        return debitAccount;
    }

    public void setDebitAccount(Account debitAccount) {
        this.debitAccount = debitAccount;
    }

    public BalanceDirection getBalanceDirection() {
        return balanceDirection;
    }

    public void setBalanceDirection(BalanceDirection balanceDirection) {
        this.balanceDirection = balanceDirection;
    }
}
