package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Material;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface MaterialApi extends BaseUnitApi {

    Material get(String id);

    Page<Material> pagingQuery(int pageIndex, int pageSize, Material queryEntity);

    Material save(Material entity);

}
