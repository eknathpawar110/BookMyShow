package com.example.BookMyShow.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowDto {

    private  int id;
    private LocalDate showDate;
    private LocalTime showTime;

    private MovieDto movieDto;

    private TheatreDto theatreDto;

}
