package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.fw.core.BaseInfo;

import javax.persistence.*;

/**
 * Created by linjietao on 2015/12/28.
 */
@Entity
@Table(name = "F_BD_AccountingItems")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "FGroupID", discriminatorType = DiscriminatorType.INTEGER)
public class AccountingItems extends BaseInfo {
    private static final long serialVersionUID = 7067946741047360110L;
}
