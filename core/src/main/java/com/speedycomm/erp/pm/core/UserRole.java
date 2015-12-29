package com.speedycomm.erp.pm.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 用户角色
 */
@Entity
@Table(name = "T_PM_UserRole")
public class UserRole extends UnitRelation {

    private static final long serialVersionUID = 2525035647299441132L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FUserID")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FRoleID")
    private Role role;
}
