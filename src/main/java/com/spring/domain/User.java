package com.spring.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;



@Entity
@Table(name = "users")
public @Data class User {
    @Id
    private int id;

    private String name;

    private String email;

    private String password;

    private String CPF;

    private String username;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @OneToOne
    private Favorites favorites;

    @Column(name = "user_lists_ids")
    private ArrayList<UserList> userLists;
}
