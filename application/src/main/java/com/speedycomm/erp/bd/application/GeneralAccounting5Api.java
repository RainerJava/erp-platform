package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.GeneralAccounting5;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface GeneralAccounting5Api extends BaseUnitApi {

    GeneralAccounting5 get(String id);

    Page<GeneralAccounting5> pagingQuery(int pageIndex, int pageSize, GeneralAccounting5 queryEntity);

    GeneralAccounting5 save(GeneralAccounting5 entity);

}
