package com.spring.domain;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "movie")
public @Data class Movie {

    @Id
    private int id;

    @Column(name = "title_movie")
    private String titleMovie;
}
