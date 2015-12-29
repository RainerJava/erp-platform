package com.speedycomm.erp.bd.web.controller;

import com.speedycomm.erp.fw.facade.BaseDataFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by linjietao on 2015/12/24.
 */
@Controller
@RequestMapping("/bd")
public class BaseDataController {

    @ResponseBody
    @RequestMapping("/genders")
    public Map<Integer, String> getGenders() {
        return BaseDataFacade.getGenders();
    }
}
