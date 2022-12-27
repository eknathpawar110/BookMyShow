package com.example.BookMyShow.Service;

import com.example.BookMyShow.dto.TheatreDto;

public interface TheatreService {

    // add theatre
    public  void addTheatre(TheatreDto theatreDto);

    // get theatre
    public  TheatreDto getTheatre(int id);

}
