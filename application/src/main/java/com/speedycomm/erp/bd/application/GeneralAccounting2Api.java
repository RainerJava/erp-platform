package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.GeneralAccounting2;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface GeneralAccounting2Api extends BaseUnitApi {

    GeneralAccounting2 get(String id);

    Page<GeneralAccounting2> pagingQuery(int pageIndex, int pageSize, GeneralAccounting2 queryEntity);

    GeneralAccounting2 save(GeneralAccounting2 entity);

}
