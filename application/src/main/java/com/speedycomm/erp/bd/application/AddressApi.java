package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Address;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface AddressApi extends BaseUnitApi {

    Address get(String id);

    Page<Address> pagingQuery(int pageIndex, int pageSize, Address queryEntity);

    Address save(Address entity);

}
