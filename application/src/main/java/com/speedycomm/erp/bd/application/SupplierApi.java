package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Supplier;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface SupplierApi extends BaseUnitApi {

    Supplier get(String id);

    Page<Supplier> pagingQuery(int pageIndex, int pageSize, Supplier queryEntity);

    Supplier save(Supplier entity);

}
