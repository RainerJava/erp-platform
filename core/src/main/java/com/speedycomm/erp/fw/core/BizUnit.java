package com.speedycomm.erp.fw.core;

import javax.persistence.*;
import java.security.Timestamp;

/**
 * Created by linjietao on 15/12/29.
 * 业务单元
 */
@MappedSuperclass
public abstract class BizUnit extends BizInfo {

    private static final long serialVersionUID = -3600530016498273093L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FBizDate")
    private Timestamp bizDate;

    @Column(name = "FNumber", length = 64)
    private String number;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FCreateDateTime")
    private Timestamp createDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FUpdateDateTime")
    private Timestamp updateDateTime;

    @Column(name = "FIsVoucherGenerated")
    private boolean voucherGenerated;

    public Timestamp getBizDate() {
        return bizDate;
    }

    public void setBizDate(Timestamp bizDate) {
        this.bizDate = bizDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Timestamp getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Timestamp createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Timestamp getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Timestamp updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public boolean isVoucherGenerated() {
        return voucherGenerated;
    }

    public void setVoucherGenerated(boolean voucherGenerated) {
        this.voucherGenerated = voucherGenerated;
    }
}
