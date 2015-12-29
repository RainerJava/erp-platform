package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.BankAccount;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface BankAccountApi extends BaseUnitApi {

    BankAccount get(String id);

    Page<BankAccount> pagingQuery(int pageIndex, int pageSize, BankAccount queryEntity);

    BankAccount save(BankAccount entity);

}
