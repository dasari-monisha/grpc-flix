package com.grpcflix.movie.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@ToString
@Table(name = "movie")
public class Movie {

    @Id
    private int id;
    private String title;
    private int year;
    private double rating;
    private String genre;
}
