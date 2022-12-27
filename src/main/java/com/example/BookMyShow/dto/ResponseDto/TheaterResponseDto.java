package com.example.BookMyShow.dto.ResponseDto;

import com.example.BookMyShow.enums.TheaterType;

import lombok.Builder;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@Builder
public class TheaterResponseDto {

    @NotNull
    int id;

    String name;
    String address;
    String city;
    TheaterType type;
    //Show Entity
}