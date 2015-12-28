package com.speedycomm.erp.bd.core;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 2015/12/22.
 */
@Entity
@Table(name = "T_BD_Supplier")
public class Supplier extends Company {
    private static final long serialVersionUID = -1888333792727913159L;
}
