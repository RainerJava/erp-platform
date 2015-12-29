package com.speedycomm.erp.org.core;

import com.speedycomm.erp.org.OrganizationType;

import javax.persistence.*;

/**
 * Created by linjietao on 15/12/29.
 * 组织单元托管代理关系
 */
@Entity
@Table(name = "T_ORG_OrganizationAgent")
public class OrganizationAgent extends OrganizationRelation {

    private static final long serialVersionUID = 5928496647198872862L;

    @Column(name = "FAgentType")
    private OrganizationType agentType;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FAgentID")
    private Organization agent;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "FBYAgentID")
    private Organization byAgent;

    public OrganizationType getAgentType() {
        return agentType;
    }

    public void setAgentType(OrganizationType agentType) {
        this.agentType = agentType;
    }

    public Organization getAgent() {
        return agent;
    }

    public void setAgent(Organization agent) {
        this.agent = agent;
    }

    public Organization getByAgent() {
        return byAgent;
    }

    public void setByAgent(Organization byAgent) {
        this.byAgent = byAgent;
    }
}
