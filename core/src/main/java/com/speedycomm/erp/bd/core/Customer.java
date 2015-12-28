package com.speedycomm.erp.bd.core;

import com.speedycomm.erp.bd.AccountingItemsType;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 2015/12/22.
 */
@Entity
@DiscriminatorValue(value = "1")
public class Customer extends AccountingItems {
    private static final long serialVersionUID = 6029489435641832245L;
}
