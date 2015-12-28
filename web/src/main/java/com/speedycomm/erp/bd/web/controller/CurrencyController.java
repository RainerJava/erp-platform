package com.speedycomm.erp.bd.web.controller;

import com.speedycomm.erp.bd.facade.CurrencyFacade;
import com.speedycomm.erp.bd.facade.Info.CurrencyInfo;
import com.speedycomm.erp.fw.web.controller.BaseController;
import org.dayatang.utils.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by linjietao on 2015/12/24.
 */
@Controller
@RequestMapping("/bd/currency")
public class CurrencyController extends BaseController {

    @Inject
    private CurrencyFacade currencyFacade;

    @ResponseBody
    @RequestMapping("/pagingQuery")
    public Page<CurrencyInfo> pagingQuery(long page, int pageSize, CurrencyInfo example) {
        return currencyFacade.pagingQuery(page, pageSize, example);
    }

    @ResponseBody
    @RequestMapping("/get/{id}")
    public CurrencyInfo get(@PathVariable("id") String id) {
        return currencyFacade.get(id);
    }

    @ResponseBody
    @RequestMapping("/lock/{id}")
    public boolean lock(@PathVariable("id") String id) {
        return currencyFacade.lock(id);
    }

    @ResponseBody
    @RequestMapping("/remove/{id}")
    public boolean remove(@PathVariable("id") String id) {
        return currencyFacade.remove(id);
    }
}
