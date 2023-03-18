package com.ee4216.lab3.entity;

public class Movie {
    private final Long id;
    private final String name;
    private final Long year;
    private final Double rank;

    public Movie(Long id, String name, Long year, Double rank) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Long getYear() {
        return year;
    }

    public Double getRank() {
        return rank;
    }

    public Long getId() {
        return id;
    }

}
