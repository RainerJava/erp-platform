package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.AccountingType;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface AccountingTypeApi extends BaseUnitApi {

    AccountingType get(String id);

    Page<AccountingType> pagingQuery(int pageIndex, int pageSize, AccountingType queryEntity);

    AccountingType save(AccountingType entity);

}
