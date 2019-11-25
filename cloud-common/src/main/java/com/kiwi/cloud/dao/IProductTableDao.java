package com.kiwi.cloud.dao;

import com.kiwi.cloud.entity.PriceTableEntity;
import com.kiwi.cloud.entity.ProductTableEntity;
import com.kiwi.cloud.service.base.BaseRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kiwi
 * @date 2019/11/24 11:27
 */
@Repository("productTableDao")
public interface IProductTableDao extends BaseRepo<ProductTableEntity> {
}
