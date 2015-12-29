package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.GeneralAccounting1;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface GeneralAccounting1Api extends BaseUnitApi {

    GeneralAccounting1 get(String id);

    Page<GeneralAccounting1> pagingQuery(int pageIndex, int pageSize, GeneralAccounting1 queryEntity);

    GeneralAccounting1 save(GeneralAccounting1 entity);

}
