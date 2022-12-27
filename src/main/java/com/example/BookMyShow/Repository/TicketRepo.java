package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Model.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<TicketEntity,Integer> {
}
