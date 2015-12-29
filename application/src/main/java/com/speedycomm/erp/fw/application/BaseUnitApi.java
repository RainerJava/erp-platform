package com.speedycomm.erp.fw.application;

import java.util.List;

/**
 * Created by linjietao on 15/12/29.
 */
public interface BaseUnitApi {

    boolean remove(String id);

    int removeAll(List<String> ids);

    boolean enable(boolean isEnabled);
}
