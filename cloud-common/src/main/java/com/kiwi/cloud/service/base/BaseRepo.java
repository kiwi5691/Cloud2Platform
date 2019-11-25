package com.kiwi.cloud.service.base;

import com.kiwi.cloud.entity.base.BaseModel;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author kiwi
 * @date 2019/11/24 15:56
 */

@NoRepositoryBean
public interface BaseRepo<T extends BaseModel> extends PagingAndSortingRepository<T, Long>, JpaSpecificationExecutor<T> {

}