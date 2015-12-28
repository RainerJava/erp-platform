package com.speedycomm.erp.bd.application.impl;

import com.speedycomm.erp.bd.application.CurrencyApi;
import com.speedycomm.erp.bd.core.Currency;

import org.springframework.transaction.annotation.Transactional;

import javax.inject.Named;
import java.util.List;

/**
 * Created by linjietao on 2015/12/21.
 */
@Named
@Transactional(value="transactionManager_org")
public class CurrencyApiImpl implements CurrencyApi {

    public Currency getCurrencyInfo(String id) {
        return null;
    }

    public List<Currency> getCurrencySet(String[] ids) {
        return null;
    }

    public List<Currency> getCurrencySet(Currency queryInfo) {
        return null;
    }

    public Currency saveCurrencyInfo(String id) {
        return null;
    }

    public boolean removeCurrencyInfo(String id) {
        return true;
    }

    public int removeCurrencySet(String[] ids) {
        return 1;
    }

    public boolean deleteCurrencyInfo(String id) {
        return false;
    }

    public int deleteCurrencySet(String[] ids) {
        return 1;
    }
}
