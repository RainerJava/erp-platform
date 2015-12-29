package com.speedycomm.erp.fi.gl.core;

import com.speedycomm.erp.fi.BalanceDirection;
import com.speedycomm.erp.fi.core.Account;
import com.speedycomm.erp.fw.core.BizEntry;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by linjietao on 15/12/29.
 * 财务凭证分录
 */
@Entity
@Table(name = "T_GL_VoucherEntry")
public class VoucherEntry extends BizEntry {

    private static final long serialVersionUID = 983619623254633843L;

    @Column(name = "FCreditAmount", scale = 4)
    private BigDecimal creditAmount;

    @Column(name = "FDebitAmount", scale = 4)
    private BigDecimal debitAmount;

    @Column(name = "FDirection")
    private BalanceDirection direction;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FAccountID")
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FBillID")
    private Voucher bill;

    @Column(name = "FDetailsSize")
    private int detailsSize;

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }

    public BalanceDirection getDirection() {
        return direction;
    }

    public void setDirection(BalanceDirection direction) {
        this.direction = direction;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Voucher getBill() {
        return bill;
    }

    public void setBill(Voucher bill) {
        this.bill = bill;
    }

    public int getDetailsSize() {
        return detailsSize;
    }

    public void setDetailsSize(int detailsSize) {
        this.detailsSize = detailsSize;
    }
}
