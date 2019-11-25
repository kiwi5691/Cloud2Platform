package com.kiwi.cloud.service;

import com.kiwi.cloud.entity.PriceTableEntity;
import com.kiwi.cloud.entity.ProductTableEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author kiwi
 * @date 2019/11/24 11:38
 */
public interface IProductTableService {
    Page<ProductTableEntity> findAllPriceTableEntity(Pageable pageable);
    int insert();
}
