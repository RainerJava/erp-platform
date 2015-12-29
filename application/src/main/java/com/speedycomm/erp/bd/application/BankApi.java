package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Bank;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface BankApi extends BaseUnitApi {

    Bank get(String id);

    Page<Bank> pagingQuery(int pageIndex, int pageSize, Bank queryEntity);

    Bank save(Bank entity);

}
