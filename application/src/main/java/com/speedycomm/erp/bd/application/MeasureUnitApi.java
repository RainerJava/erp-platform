package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.MeasureUnit;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface MeasureUnitApi extends BaseUnitApi {

    MeasureUnit get(String id);

    Page<MeasureUnit> pagingQuery(int pageIndex, int pageSize, MeasureUnit queryEntity);

    MeasureUnit save(MeasureUnit entity);

}
