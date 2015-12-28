package com.speedycomm.erp.fw.core;

import com.speedycomm.erp.fw.UuidEntity;

import javax.persistence.*;
import java.security.Timestamp;

/**
 * Created by linjietao on 2015/12/18.
 */
@MappedSuperclass
public abstract class BizInfo extends UuidEntity {

    private static final long serialVersionUID = 4337453038067165845L;

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
    private boolean isVoucherGenerated;

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
        return isVoucherGenerated;
    }

    public void setVoucherGenerated(boolean voucherGenerated) {
        isVoucherGenerated = voucherGenerated;
    }
}
