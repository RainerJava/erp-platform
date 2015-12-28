package com.speedycomm.erp.fi.core;

import com.speedycomm.erp.fi.BalanceDirection;
import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 2015/12/22.
 * 财务会计科目
 */
@Entity
@Table(name = "T_FI_Account")
public class Account extends BaseInfo {

    private static final long serialVersionUID = 8250031914629449694L;

    /*
     * 缺省余额方向
     */
    @Column(name = "FBalanceDirection")
    private BalanceDirection balanceDirection;

    public BalanceDirection getBalanceDirection() {
        return balanceDirection;
    }

    public void setBalanceDirection(BalanceDirection balanceDirection) {
        this.balanceDirection = balanceDirection;
    }
}
