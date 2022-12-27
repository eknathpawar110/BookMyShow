package com.example.BookMyShow.Service;

import com.example.BookMyShow.dto.MovieDto;
import com.example.BookMyShow.dto.UserDto;

public interface MovieService {

    // add movie
    public void addMovie(MovieDto movieDto);

    //get movies
    public MovieDto getMovie(int id);
}
