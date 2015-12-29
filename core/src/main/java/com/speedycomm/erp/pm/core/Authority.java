package com.speedycomm.erp.pm.core;

import com.speedycomm.erp.fw.core.BaseInfo;
import com.speedycomm.erp.rs.core.Resource;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 用户权限
 */
@Entity
@Table(name = "T_PM_Authority")
public class Authority extends BaseInfo {

    private static final long serialVersionUID = 3229820623035812066L;

    @Column(name = "FName", nullable = false, length = 32)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "FResourceID")
    private Resource resource;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
}
