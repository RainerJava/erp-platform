package com.speedycomm.erp.fs.core;

import com.speedycomm.erp.fs.SettlementEnum;
import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 2015/12/22.
 * 付款类型
 */
@Entity
@Table(name = "T_FS_SettlementType")
public class SettlementType extends BaseInfo {

    private static final long serialVersionUID = 6078857159937154420L;

    @Column(name = "FSettlementEnum")
    private SettlementEnum settlementEnum;

    public SettlementEnum getSettlementEnum() {
        return settlementEnum;
    }

    public void setSettlementEnum(SettlementEnum settlementEnum) {
        this.settlementEnum = settlementEnum;
    }
}
