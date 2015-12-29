package com.speedycomm.erp.rs.core;

import com.speedycomm.erp.fw.core.BaseInfo;

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

    @Column(name = "FUrl", length = 255)
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
