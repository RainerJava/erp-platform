package com.speedycomm.erp.bd.facade;

import com.speedycomm.erp.bd.facade.Info.CurrencyInfo;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 2015/12/24.
 */
public interface CurrencyFacade {

    CurrencyInfo get(String id);

    Page<CurrencyInfo> pagingQuery(long page, int pageSize, CurrencyInfo queryInfo);

    boolean save(CurrencyInfo currencyInfo);

    boolean lock(String id);

    boolean remove(String id);

}
