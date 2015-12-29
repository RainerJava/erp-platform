package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.MeasureUnitGroup;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface MeasureUnitGroupApi extends BaseUnitApi {

    MeasureUnitGroup get(String id);

    Page<MeasureUnitGroup> pagingQuery(int pageIndex, int pageSize, MeasureUnitGroup queryEntity);

    MeasureUnitGroup save(MeasureUnitGroup entity);

}
