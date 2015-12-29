package com.speedycomm.erp.hr.core;

import com.speedycomm.erp.fw.core.BaseUnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 职员学历关系
 */
@Entity
@Table(name = "T_HR_PersonPolitics")
public class PersonDegree extends BaseUnitRelation {

    private static final long serialVersionUID = 685443982482139683L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FPersonID")
    private Person person;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FDegreeID")
    private Degree degree;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

}
