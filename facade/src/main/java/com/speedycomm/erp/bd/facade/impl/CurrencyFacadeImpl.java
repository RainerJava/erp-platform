package com.speedycomm.erp.bd.facade.impl;

import com.speedycomm.erp.bd.application.CurrencyApi;
import com.speedycomm.erp.bd.core.Currency;
import com.speedycomm.erp.bd.facade.CurrencyFacade;
import com.speedycomm.erp.bd.facade.Info.CurrencyInfo;
import org.dayatang.utils.Page;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linjietao on 2015/12/24.
 */
@Named
public class CurrencyFacadeImpl implements CurrencyFacade {

    @Inject
    private CurrencyApi currencyApi;

    public CurrencyInfo get(String id) {
        Currency currency = currencyApi.get(id);
        CurrencyInfo currencyInfo = new CurrencyInfo(currency);
        return currencyInfo;
    }

    public Page<CurrencyInfo> pagingQuery(int pageIndex, int pageSize, CurrencyInfo queryInfo) {
        Page<Currency> entities = currencyApi.pagingQuery(pageIndex, pageSize, queryInfo.toEntity());
        return null;
    }

    public boolean save(CurrencyInfo currencyInfo) {
        return true;
    }

    public boolean lock(String id) {
        return true;
    }

    public boolean remove(String id) {
        return true;
    }
}
