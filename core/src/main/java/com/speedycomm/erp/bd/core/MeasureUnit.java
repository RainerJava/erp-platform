package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseUnit;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/22.
 * 计量单位
 */
@Entity
@Table(name = "T_BD_MeasureUnit")
public class MeasureUnit extends BaseUnit {

    private static final long serialVersionUID = -5605741078317974901L;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FMeasureUnitGroupID")
    private MeasureUnitGroup measureUnitGroup;

    public MeasureUnitGroup getMeasureUnitGroup() {
        return measureUnitGroup;
    }

    public void setMeasureUnitGroup(MeasureUnitGroup measureUnitGroup) {
        this.measureUnitGroup = measureUnitGroup;
    }
}
