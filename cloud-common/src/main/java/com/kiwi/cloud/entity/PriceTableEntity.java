package com.kiwi.cloud.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kiwi.cloud.entity.base.BaseModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

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
    @GenericGenerator(name = "snowf-id", strategy = "com.kiwi.cloud.utils.SnowflakeIDGenerator")
    @Column(name = "id")
    private Long id;


    @Basic
    @Column(name = "price")
    private String price;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private ProductTableEntity productTableEntity;

}
