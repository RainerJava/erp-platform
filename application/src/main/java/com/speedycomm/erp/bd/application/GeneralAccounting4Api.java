package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.GeneralAccounting4;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface GeneralAccounting4Api extends BaseUnitApi {

    GeneralAccounting4 get(String id);

    Page<GeneralAccounting4> pagingQuery(int pageIndex, int pageSize, GeneralAccounting4 queryEntity);

    GeneralAccounting4 save(GeneralAccounting4 entity);

}
