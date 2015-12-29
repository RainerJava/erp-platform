package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseUnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by linjietao on 2015/12/22.
 * 计量单位组
 */
@Entity
@Table(name = "T_BD_MeasureUnitGroup")
public class MeasureUnitGroup extends BaseUnit {

    private static final long serialVersionUID = 5945778623230842096L;

    @Column(name = "FCarry", scale = 4)
    private BigDecimal carry;

    public BigDecimal getCarry() {
        return carry;
    }

    public void setCarry(BigDecimal carry) {
        this.carry = carry;
    }
}
