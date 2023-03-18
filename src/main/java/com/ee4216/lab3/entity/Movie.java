package com.ee4216.lab3.entity;

public class Movie {
    private Long id;
    private String name;
    private Long year;
    private Double rank;

    public Movie(Long id, String name, Long year, Double rank) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
