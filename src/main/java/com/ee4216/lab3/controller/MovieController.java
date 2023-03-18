package com.ee4216.lab3.controller;

import com.ee4216.lab3.dao.MovieDao;
import com.ee4216.lab3.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    private final MovieDao movieDao;
    public MovieController(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @GetMapping("")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/movies")
    @ResponseBody
    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }

    @PutMapping("/movies/{id}")
    public void updateMovie(@PathVariable Long id, @RequestBody Movie updatedMovie) {
        movieDao.updateMovie(id, updatedMovie);
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieDao.deleteMovie(id);
    }
}
