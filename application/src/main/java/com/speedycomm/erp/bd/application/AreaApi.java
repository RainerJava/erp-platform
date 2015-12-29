package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Area;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface AreaApi extends BaseUnitApi {

    Area get(String id);

    Page<Area> pagingQuery(int pageIndex, int pageSize, Area queryEntity);

    Area save(Area entity);
}
