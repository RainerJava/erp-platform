package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/22.
 * 计量单位
 */
@Entity
@Table(name = "T_BD_MeasureUnit")
public class MeasureUnit extends BaseInfo {

    private static final long serialVersionUID = -5605741078317974901L;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn()
    private MeasureUnit parent;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FMeasureUnitGroupID")
    private MeasureUnitGroup measureUnitGroup;
}
