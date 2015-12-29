package com.speedycomm.erp.rs.core;

import com.speedycomm.erp.fw.core.BaseInfo;
import com.speedycomm.erp.rs.ResourceType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by linjietao on 15/12/29.
 */
@Entity
@Table(name = "T_RS_Resource")
public class Resource extends BaseInfo {

    private static final long serialVersionUID = -9033753882311130334L;

    @Column(name = "FName")
    private String name;

    @Column(name = "FResourceValue")
    private String resourceValue;

    @Column(name = "FResourceType")
    private ResourceType resourceType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }
}
