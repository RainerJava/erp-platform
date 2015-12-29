package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 2015/12/22.
 * 金融机构
 */
@Entity
@Table(name = "T_BD_Bank")
public class Bank extends BaseInfo {
    private static final long serialVersionUID = -1469352682154953902L;
}
