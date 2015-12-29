package com.speedycomm.erp.pm.core;

import com.speedycomm.erp.fw.core.UnitRelation;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 权限角色关系
 */
@Entity
@Table(name = "T_PM_AuthorityInRole")
public class AuthorityInRole extends UnitRelation {

    private static final long serialVersionUID = -7380871398284038431L;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FAuthorityID")
    private Authority authority;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FRoleID")
    private Role role;

    public Authority getAuthority() {
        return authority;
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
