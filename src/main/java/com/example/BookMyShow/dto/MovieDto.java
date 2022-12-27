package com.example.BookMyShow.dto;

import com.example.BookMyShow.Model.ShowEntity;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {


    private int id;
    private  String name;
    private LocalDate releaseDate;
    private List<ShowDto> moviesShow;
}
