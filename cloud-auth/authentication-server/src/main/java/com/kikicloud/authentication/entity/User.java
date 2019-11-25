package com.kikicloud.authentication.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Collection;
import java.util.Set;


@Data
@Table(name = "users")
public class User implements UserDetails {

    @Id
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "frozen")
    private Byte frozen;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Transient
    Set<GrantedAuthority> authorities;

    public User() {
    }

    public User(Integer id, String username, String password, Byte frozen, String phone, String email) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.frozen = frozen;
        this.phone = phone;
        this.email = email;
    }

    public User(Integer id, String username, String password, Byte frozen, String phone, String email, Set authorities) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.frozen = frozen;
        this.phone = phone;
        this.email = email;
        this.authorities = authorities;
    }

    public void setAuthorities(Set<GrantedAuthority> authorities) {
        this.authorities=authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        int enable = this.frozen;
        if (enable == 1){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.username;
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }
}
