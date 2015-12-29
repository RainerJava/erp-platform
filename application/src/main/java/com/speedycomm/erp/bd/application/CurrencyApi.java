package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Currency;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 2015/12/21.
 */
public interface CurrencyApi extends BaseUnitApi {

    Currency get(String id);

    Page<Currency> pagingQuery(int pageIndex, int pageSize, Currency queryEntity);

    Currency save(Currency entity);
}
