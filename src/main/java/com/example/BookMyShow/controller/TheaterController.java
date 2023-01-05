package com.example.BookMyShow.controller;

import com.example.BookMyShow.Service.impl.TheaterServiceImpl;
import com.example.BookMyShow.dto.EntryDto.TheaterEntryDto;
import com.example.BookMyShow.dto.ResponseDto.TheaterResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("theater")
public class TheaterController {

    @Autowired
    TheaterServiceImpl theaterService;


    @PostMapping("/add")
    public TheaterResponseDto addTheater(@RequestBody() TheaterEntryDto theaterEntryDto){

        return theaterService.addTheater(theaterEntryDto);

    }

    @GetMapping("/getTheaterDetails/{id}")
    public TheaterResponseDto getTheaterDetails(@PathVariable("id") int theaterId){
        return theaterService.getTheater(theaterId);
    }

}