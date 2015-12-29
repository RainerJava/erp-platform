package com.speedycomm.erp.hr.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 学历获取的学位关系
 */
@Entity
@Table(name = "T_HR_DegreeInAcademic")
public class DegreeInAcademic extends UnitRelation {

    private static final long serialVersionUID = 372701177322059176L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FAcademicID")
    private Academic academic;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FDegreeID")
    private Degree degree;

    public Academic getAcademic() {
        return academic;
    }

    public void setAcademic(Academic academic) {
        this.academic = academic;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
