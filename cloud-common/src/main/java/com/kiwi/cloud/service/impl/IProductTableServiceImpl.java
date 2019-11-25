package com.kiwi.cloud.service.impl;

import com.kiwi.cloud.dao.IPriceTableDao;
import com.kiwi.cloud.dao.IProductTableDao;
import com.kiwi.cloud.entity.PriceTableEntity;
import com.kiwi.cloud.entity.ProductTableEntity;
import com.kiwi.cloud.service.IPriceTableService;
import com.kiwi.cloud.service.IProductTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kiwi
 * @date 2019/11/24 11:39
 */
@Service("productTableService")
public class IProductTableServiceImpl implements IProductTableService {
    @Autowired
    private IProductTableDao productTableDao;

    @Override
    public Page<ProductTableEntity> findAllPriceTableEntity(Pageable pageable) {
        return productTableDao.findAll(pageable);
    }

    @Override
    public int insert() {
        List<ProductTableEntity> priceTableEntities= new ArrayList<>();
        ProductTableEntity priceTableEntity = new ProductTableEntity();
        priceTableEntity.setProductName("aaa");
        priceTableEntities.add(priceTableEntity);
        productTableDao.saveAll(priceTableEntities);
        return 0;
    }
}
