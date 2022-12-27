package com.example.BookMyShow.Service;

import com.example.BookMyShow.dto.ShowDto;

public interface ShowService {
     //add
    public ShowDto addShow(ShowDto showDto);


    //get
    public ShowDto grtShow(int id);
}
