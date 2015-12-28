package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by linjietao on 2015/12/22.
 */
public class MeasureUnit extends BaseInfo {

    private static final long serialVersionUID = -5605741078317974901L;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FMeasureUnitGroupID")
    private MeasureUnitGroup measureUnitGroup;
}
