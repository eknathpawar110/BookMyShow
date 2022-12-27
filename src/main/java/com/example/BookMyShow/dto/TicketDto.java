package com.example.BookMyShow.dto;

import lombok.*;

import java.util.Date;


@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {

    private int id;
    private String allottedSeat;
    private double amount;
    private Date bookedAt;
}
