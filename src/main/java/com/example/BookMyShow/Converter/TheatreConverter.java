package com.example.BookMyShow.Converter;


import com.example.BookMyShow.Model.TheatreEntity;
import com.example.BookMyShow.dto.TheatreDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheatreConverter {

    public static TheatreEntity dtoToEntity(TheatreDto theatreDto){
        return TheatreEntity.builder().city(theatreDto.getCity()).name(theatreDto.getName()).address(theatreDto.getAddress()).build();
    }
    public static TheatreDto entityToDTO(TheatreEntity theatreEntity){
        return TheatreDto.builder().city(theatreEntity.getCity()).name(theatreEntity.getName()).address(theatreEntity.getAddress()).build();
    }
}
