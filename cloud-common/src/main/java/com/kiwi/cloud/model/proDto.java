package com.kiwi.cloud.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author kiwi
 * @date 2019/11/24 16:18
 */
//@Entity
//@Table(name = "productTable")
public class proDto implements Serializable {
    private Long id;
    private String productName;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO, generator = "snowf-id")
//    @GenericGenerator(name = "snowf-id", strategy = "com.kiwi.cloud.utils.SnowflakeIDGenerator")
//    @Column(name = "id")
//    public Long getId() {
//        return id;
//    }

}
