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
    private String authority;

    // keep protected for JPA
    protected Authority(String authority) {
        this.authority = authority;
    }

    // nice factory method (optional but clean)
    public static Authority of(String authority) {
        return new Authority(authority);
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
