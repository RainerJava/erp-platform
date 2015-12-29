package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.City;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface CityApi extends BaseUnitApi {

    City get(String id);

    Page<City> pagingQuery(int pageIndex, int pageSize, City queryEntity);

    City save(City entity);

}
