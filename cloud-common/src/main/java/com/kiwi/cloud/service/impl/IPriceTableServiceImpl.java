package com.kiwi.cloud.service.impl;

import com.kiwi.cloud.dao.IPriceTableDao;
import com.kiwi.cloud.entity.PriceTableEntity;
import com.kiwi.cloud.service.IPriceTableService;
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
@Service("priceTableService")
public class IPriceTableServiceImpl implements IPriceTableService {
    @Autowired
    private IPriceTableDao priceTableDao;

    @Override
    public Page<PriceTableEntity> findAllPriceTableEntity(Pageable pageable) {
        return priceTableDao.findAll(pageable);
    }

    @Override
    public int insert() {
        List<PriceTableEntity> priceTableEntities= new ArrayList<>();
        PriceTableEntity priceTableEntity = new PriceTableEntity();
        priceTableEntity.setPrice("aaa");
        Long l = new Long(321321);
        priceTableEntities.add(priceTableEntity);
        priceTableDao.saveAll(priceTableEntities);
        return 0;
    }
}
