package com.kiwi.cloud.common.core.service;

import com.kiwi.cloud.common.core.entity.PriceTableEntity;
import com.kiwi.cloud.common.core.entity.ProductTableEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author kiwi
 * @date 2019/11/24 11:38
 */
public interface IProductTableService {
    Page<ProductTableEntity> findAllPriceTableEntity(Pageable pageable);
    int insert();
}
