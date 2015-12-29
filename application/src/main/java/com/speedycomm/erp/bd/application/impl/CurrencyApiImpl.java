package com.speedycomm.erp.bd.application.impl;

import com.speedycomm.erp.bd.application.CurrencyApi;
import com.speedycomm.erp.bd.core.Currency;

import org.dayatang.utils.Page;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Named;
import java.util.List;

/**
 * Created by linjietao on 2015/12/21.
 */
@Named
@Transactional(value="tm_bd_currency")
public class CurrencyApiImpl implements CurrencyApi {

    public Currency get(String id) {
        return Currency.get(Currency.class, id);
    }

    public Page<Currency> pagingQuery(int pageIndex, int pageSize, Currency queryEntity) {
        return null;
    }

    public Currency save(Currency entity) {
        entity.save();
        return entity;
    }

    public boolean remove(String id) {
        boolean result = false;
        Currency entity = Currency.load(Currency.class, id);
        try {
            Currency.getRepository().remove(entity);
            result = true;
        } catch (Exception err) {
            //
        }
        return result;
    }

    public int removeAll(List<String> ids) {
        return 0;
    }

    public boolean enable(boolean isEnabled) {
        return true;
    }
}
