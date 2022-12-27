package com.example.BookMyShow.Service.Imp;

import com.example.BookMyShow.Model.MovieEntity;
import com.example.BookMyShow.Repository.MovieRepo;
import com.example.BookMyShow.Service.MovieService;
import com.example.BookMyShow.dto.MovieDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.BookMyShow.Converter.MovieConverter.dtoToMovie;
import static com.example.BookMyShow.Converter.MovieConverter.movieTODto;

@Service
public class MovieServiceImp implements MovieService {

    @Autowired
    MovieRepo movieRepo;

    @Override
    public void addMovie(MovieDto movieDto) {
       MovieEntity movieEntity=dtoToMovie(movieDto);
       movieRepo.save(movieEntity);
    }

    @Override
    public MovieDto getMovie(int id) {
        MovieEntity movieEntity=movieRepo.findById(id).get();
        return movieTODto(movieEntity);
    }
}
