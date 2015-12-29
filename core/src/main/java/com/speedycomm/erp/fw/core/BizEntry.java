package com.speedycomm.erp.fw.core;

import com.speedycomm.erp.fw.UuidEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by linjietao on 15/12/29.
 */
@MappedSuperclass
public abstract class BizEntry extends UuidEntity {

    private static final long serialVersionUID = -7034975255387376502L;

    @Column(name = "FSeq")
    private int seq;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}
