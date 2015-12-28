package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Currency;

import java.util.List;

/**
 * Created by linjietao on 2015/12/21.
 */
public interface CurrencyApi {

    Currency getCurrencyInfo(String id);

    List<Currency> getCurrencySet(String[] ids);

    List<Currency> getCurrencySet(Currency queryInfo);

    Currency saveCurrencyInfo(String id);

    boolean removeCurrencyInfo(String id);

    int removeCurrencySet(String[] ids);

    boolean deleteCurrencyInfo(String id);

    int deleteCurrencySet(String[] ids);
}
