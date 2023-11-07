package com.spring.domain;

import com.spring.commom.ListCommom;
import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "favorites")
public @Data class Favorites extends ListCommom {
    @OneToOne
    private User user;
}
