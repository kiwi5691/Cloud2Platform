package com.kiwi.cloud.common.core.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * @author linqw
 * @2019-11-25-14:23
 */
@MappedSuperclass
@Data
public class BaseModel implements Serializable {

    public final static String DEFAULT_USERNAME = "system";

    @Column(name = "created_ts")
    private Date createdTs = new Date();

    /**
     * 创建人id
     */
    private Long creator;

    /**
     * 最近修改时间
     */
    @Column(name = "last_modified_ts")
    private Date lastModifiedTs = new Date();

    /**
     * 最近修改人id
     */
    private Long editor;
}
