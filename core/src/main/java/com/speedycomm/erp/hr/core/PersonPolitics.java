package com.speedycomm.erp.hr.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 职员政治背景关系
 */
@Entity
@Table(name = "T_HR_PersonPolitics")
public class PersonPolitics extends UnitRelation {

    private static final long serialVersionUID = -7312603017952226093L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FPersonID")
    private Person person;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FPoliticsID")
    private Politics politics;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Politics getPolitics() {
        return politics;
    }

    public void setPolitics(Politics politics) {
        this.politics = politics;
    }
}
