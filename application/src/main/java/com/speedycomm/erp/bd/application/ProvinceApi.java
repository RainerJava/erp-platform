package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Province;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface ProvinceApi extends BaseUnitApi {

    Province get(String id);

    Page<Province> pagingQuery(int pageIndex, int pageSize, Province queryEntity);

    Province save(Province entity);

}
