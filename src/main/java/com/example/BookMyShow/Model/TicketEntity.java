package com.example.BookMyShow.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="allottedSeat",nullable = false)
    private String allottedSeat;
    @Column(name = "amount",nullable = false)
    private double amount; //Change
    @Column(name = "bookedAt",nullable = false)
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private UserEntity user;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private ShowEntity show;

    @OneToMany(mappedBy = "tickets",cascade = CascadeType.ALL)
    private List<ShowSeatEntity> seats;

}
