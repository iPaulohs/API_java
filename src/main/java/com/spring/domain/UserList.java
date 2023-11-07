package com.spring.domain;

import com.spring.commom.ListCommom;
import lombok.*;

import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
public @Data class UserList extends ListCommom {

    @ManyToOne
    private User user;
}
