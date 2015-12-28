package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 2015/12/18.
 */
@Entity
@Table(name = "T_BD_Currency")
public class Currency extends BaseInfo {
    private static final long serialVersionUID = 672349085635134403L;

    @Column(name = "FSymbol", length = 4)
    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
