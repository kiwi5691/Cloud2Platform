package com.kiwi.cloud.common.core.service;

import com.kiwi.cloud.common.core.entity.PriceTableEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author kiwi
 * @date 2019/11/24 11:38
 */
public interface IPriceTableService {
    Page<PriceTableEntity> findAllPriceTableEntity(Pageable pageable);
    int insert();
}
