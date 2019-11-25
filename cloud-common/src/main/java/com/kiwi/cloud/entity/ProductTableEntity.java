package com.kiwi.cloud.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kiwi.cloud.entity.base.BaseModel;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author kiwi
 * @date 2019/11/24 11:24
 */
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "productTable")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductTableEntity extends BaseModel {
    private Long id;
    private String productName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "snowf-id")
    @GenericGenerator(name = "snowf-id", strategy = "com.kiwi.cloud.utils.SnowflakeIDGenerator")
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}
