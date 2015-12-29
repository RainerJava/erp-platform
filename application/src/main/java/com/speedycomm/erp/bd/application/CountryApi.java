package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Country;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface CountryApi extends BaseUnitApi {

    Country get(String id);

    Page<Country> pagingQuery(int pageIndex, int pageSize, Country queryEntity);

    Country save(Country entity);

}
