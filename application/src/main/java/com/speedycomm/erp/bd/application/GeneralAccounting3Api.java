package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.GeneralAccounting3;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface GeneralAccounting3Api extends BaseUnitApi {

    GeneralAccounting3 get(String id);

    Page<GeneralAccounting3> pagingQuery(int pageIndex, int pageSize, GeneralAccounting3 queryEntity);

    GeneralAccounting3 save(GeneralAccounting3 entity);

}
