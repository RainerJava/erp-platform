package com.speedycomm.erp.org.application;

import com.speedycomm.erp.fw.application.BaseUnitApi;
import com.speedycomm.erp.org.core.Organization;

import java.util.List;

/**
 * Created by linjietao on 15/12/29.
 */
public interface OrganizationApi extends BaseUnitApi {

    Organization get(String id);

    Organization pagingQuery(int pageIndex, int pageSize, Organization queryEntity);

    Organization save(Organization entity);

    boolean removeChildren(String id);

    boolean lock(String id);

    boolean sealUp(String id);

    List<Organization> getChildren(String id);

    Organization getParent(String id);

    List<Organization> getAllParent(String id);

}
