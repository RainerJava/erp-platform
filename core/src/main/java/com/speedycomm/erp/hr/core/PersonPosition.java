package com.speedycomm.erp.hr.core;

import com.speedycomm.erp.fw.core.BaseUnitRelation;
import com.speedycomm.erp.org.core.Position;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 职员职务
 */
@Entity
@Table(name = "T_HR_PersonPosition")
public class PersonPosition extends BaseUnitRelation {

    private static final long serialVersionUID = -1484557038983702321L;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FPersonID")
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FPositionID")
    private Position position;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
