package com.speedycomm.erp.fi.gl.core;

import com.speedycomm.erp.fw.core.BizUnit;
import com.speedycomm.erp.hr.core.Person;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by linjietao on 15/12/29.
 * 财务凭证
 */
@Entity
@Table(name = "T_GL_Voucher")
public class Voucher extends BizUnit {

    private static final long serialVersionUID = -5356467482245106221L;

    @Column(name = "FCreditAmount", scale = 4)
    private BigDecimal creditAmount;

    @Column(name = "FDebitAmount", scale = 4)
    private BigDecimal debitAmount;

    @Column(name = "FEntriesSize")
    private int entriesSize;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FMakerID")
    private Person maker;

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

    public int getEntriesSize() {
        return entriesSize;
    }

    public void setEntriesSize(int entriesSize) {
        this.entriesSize = entriesSize;
    }

    public Person getMaker() {
        return maker;
    }

    public void setMaker(Person maker) {
        this.maker = maker;
    }
}
