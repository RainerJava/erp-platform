package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Company;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface CompanyApi extends BaseUnitApi {

    Company get(String id);

    Page<Company> pagingQuery(int pageIndex, int pageSize, Company queryEntity);

    Company save(Company entity);

}
