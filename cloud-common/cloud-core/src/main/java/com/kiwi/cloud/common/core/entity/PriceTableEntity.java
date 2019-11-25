package com.kiwi.cloud.common.core.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kiwi.cloud.common.core.entity.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author kiwi
 * @date 2019/11/24 11:24
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "price_Table", schema = "demo", catalog = "")
public class PriceTableEntity extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "snowf-id")
    @GenericGenerator(name = "snowf-id", strategy = "com.kiwi.cloud.common.core.utils.SnowflakeIDGenerator")
    @Column(name = "id")
    private Long id;


    @Basic
    @Column(name = "price")
    private String price;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private ProductTableEntity productTableEntity;

}
