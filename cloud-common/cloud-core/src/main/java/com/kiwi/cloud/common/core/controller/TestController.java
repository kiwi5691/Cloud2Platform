package com.kiwi.cloud.common.core.controller;

import com.kiwi.cloud.common.core.entity.PriceTableEntity;
import com.kiwi.cloud.common.core.entity.ProductTableEntity;
import com.kiwi.cloud.common.core.service.IPriceTableService;
import com.kiwi.cloud.common.core.service.IProductTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kiwi
 * @date 2019/11/24 11:49
 */
@RestController
public class TestController {
    @Autowired
    private IPriceTableService priceTableService;

    @Autowired
    private IProductTableService productTableService;

    @RequestMapping("/findAll")
    public Page<PriceTableEntity> findAllUser(@RequestParam(value = "page", required = false) Integer page,
                                              @RequestParam(value = "pagesize", required = false) Integer pagesize){
//        priceTableService.insert();
//        priceTableService.insert();
        if (page == null) {
            page = 0;
        }
        if (pagesize == null) {
            pagesize = 10;
        }
        Pageable pageable = PageRequest.of(page, pagesize);
        return priceTableService.findAllPriceTableEntity(pageable);
    }
    @RequestMapping("/findAllPrice")
    public Page<ProductTableEntity> findAllUsaer(@RequestParam(value = "page", required = false) Integer page,
                                                 @RequestParam(value = "pagesize", required = false) Integer pagesize){
        if (page == null) {
            page = 0;
        }
        if (pagesize == null) {
            pagesize = 10;
        }
        Pageable pageable = PageRequest.of(page, pagesize);

//        productTableService.insert();
//        productTableService.insert();
        return productTableService.findAllPriceTableEntity(pageable);
    }

}
