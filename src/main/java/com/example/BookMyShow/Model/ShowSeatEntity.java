package com.example.BookMyShow.Model;


import com.example.BookMyShow.enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="ShowSeat")
public class ShowSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int rate;
    private String seatNumber;
    private SeatType seatType;
    private boolean booked;
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
   TicketEntity ticket;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    ShowEntity show;

}
