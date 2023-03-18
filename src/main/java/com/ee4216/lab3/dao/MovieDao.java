package com.ee4216.lab3.dao;

import com.ee4216.lab3.entity.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class MovieDao {

    private final JdbcTemplate jdbcTemplate;

    public MovieDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Movie> getAllMovies() {
        String sql = "SELECT * FROM MOVIES";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Movie(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getLong("year"),
                rs.getDouble("rank")
        ));
    }

    public void updateMovie(Long id, Movie updatedMovie) {
        String sql = "UPDATE MOVIES SET id = ?, \"name\" = ?, \"year\" = ?, rank = ? WHERE id = ?";
        jdbcTemplate.update(sql,
                updatedMovie.getId(),
                updatedMovie.getName(),
                updatedMovie.getYear(),
                updatedMovie.getRank(),
                id
        );
    }

    public void deleteMovie(Long id) {
        String sql = "DELETE FROM MOVIES WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
