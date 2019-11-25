package com.kiwi.cloud.service;

import com.kiwi.cloud.entity.PriceTableEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author kiwi
 * @date 2019/11/24 11:38
 */
public interface IPriceTableService {
    Page<PriceTableEntity> findAllPriceTableEntity(Pageable pageable);
    int insert();
}
