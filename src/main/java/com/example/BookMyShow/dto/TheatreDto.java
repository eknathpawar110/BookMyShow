package com.example.BookMyShow.dto;

import com.example.BookMyShow.enums.SeatType;
import lombok.*;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheatreDto {
    private int id;

    private String name;
    private String address;
    private String city;

    ShowDto showDto;
}
