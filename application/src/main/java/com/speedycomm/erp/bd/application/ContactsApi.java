package com.speedycomm.erp.bd.application;

import com.speedycomm.erp.bd.core.Contacts;
import com.speedycomm.erp.fw.application.BaseUnitApi;
import org.dayatang.utils.Page;

/**
 * Created by linjietao on 15/12/29.
 */
public interface ContactsApi extends BaseUnitApi {

    Contacts get(String id);

    Page<Contacts> pagingQuery(int pageIndex, int pageSize, Contacts queryEntity);

    Contacts save(Contacts entity);

}
