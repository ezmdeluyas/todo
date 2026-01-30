package com.zmd.springboot.todo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Getter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class Authority implements GrantedAuthority {

    @Column(name = "authority", nullable = false, length = 50)
    private String role;

    protected Authority(String role) {
        this.role = role;
    }

    public static Authority of(String role) {
        return new Authority(role);
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
