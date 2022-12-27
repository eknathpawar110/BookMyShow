package com.example.BookMyShow.Model;



import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name",nullable = false)
    private String name;
    @Column(name = "mobile",nullable = false)
    private  String mobile;

     @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
     private List<TicketEntity> tickets;
}
