package com.speedycomm.erp.fi.gl.core;

import com.speedycomm.erp.fi.BalanceDirection;
import com.speedycomm.erp.fw.core.BizEntry;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by linjietao on 15/12/29.
 * 财务凭证分录明细
 */
@Entity
@Table(name = "T_GL_VoucherEntryDetail")
public class VoucherEntryDetail extends BizEntry {

    private static final long serialVersionUID = 4709100204213702353L;

    @Column(name = "FCreditAmount", scale = 4)
    private BigDecimal creditAmount;

    @Column(name = "FDebitAmount", scale = 4)
    private BigDecimal debitAmount;

    @Column(name = "FDirection")
    private BalanceDirection direction;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FEntryID")
    private VoucherEntry entry;

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

    public VoucherEntry getEntry() {
        return entry;
    }

    public void setEntry(VoucherEntry entry) {
        this.entry = entry;
    }
}
