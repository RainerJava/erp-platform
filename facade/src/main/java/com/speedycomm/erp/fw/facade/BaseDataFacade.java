package com.speedycomm.erp.fw.facade;

import com.speedycomm.erp.bd.Gender;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by linjietao on 2015/12/24.
 */
public final class BaseDataFacade {

    public static Map<Integer, String> getGenders() {
        Map<Integer, String> genders = new HashMap<>();
        genders.put(0, Gender.Male.getName());
        genders.put(1, Gender.Female.getName());
        return genders;
    }
}
