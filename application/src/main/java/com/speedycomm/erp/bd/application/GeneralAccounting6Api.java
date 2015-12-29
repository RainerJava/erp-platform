package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.GeneralAccounting6;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface GeneralAccounting6Api extends BaseUnitApi {

    GeneralAccounting6 get(String id);

    Page<GeneralAccounting6> pagingQuery(int pageIndex, int pageSize, GeneralAccounting6 queryEntity);

    GeneralAccounting6 save(GeneralAccounting6 entity);

}
