package com.speedycomm.erp.fi.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 2015/12/22.
 * 财务会计核算项目
 */
@Entity
@Table(name = "T_FI_Accounting")
public class Accounting extends BaseInfo {

    private static final long serialVersionUID = -2011514331787451623L;
}
