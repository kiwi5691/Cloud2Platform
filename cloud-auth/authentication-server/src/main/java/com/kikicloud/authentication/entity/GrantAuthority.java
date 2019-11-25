package com.kikicloud.authentication.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@Table(name = "authorities")
public class GrantAuthority implements Serializable {

    @Column(name = "username")
    private String username;

    @Column(name = "authority")
    private String authority;

}
