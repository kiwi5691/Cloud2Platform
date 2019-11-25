package com.kiwi.cloud.common.core.dao;

import com.kiwi.cloud.common.core.entity.PriceTableEntity;
import com.kiwi.cloud.common.core.service.base.BaseRepo;
import org.springframework.stereotype.Repository;

/**
 * @author kiwi
 * @date 2019/11/24 11:27
 */
@Repository("priceTableDao")
public interface IPriceTableDao extends BaseRepo<PriceTableEntity> {
}
