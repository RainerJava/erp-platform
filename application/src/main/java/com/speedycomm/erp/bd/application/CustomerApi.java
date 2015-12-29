package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Customer;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface CustomerApi extends BaseUnitApi {

    Customer get(String id);

    Page<Customer> pagingQuery(int pageIndex, int pageSize, Customer queryEntity);

    Customer save(Customer entity);

}
