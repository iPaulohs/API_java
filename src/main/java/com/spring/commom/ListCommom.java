package com.spring.commom;

import lombok.Data;
import com.spring.domain.Movie;
import java.util.ArrayList;
import javax.persistence.*;



@Entity
@Table(name = "list_commom")
public abstract @Data class ListCommom {
    @Id
    private int Id;

    @Column(name = "name_list")
    private String nameList;

    private ArrayList<Movie> movies;
}
