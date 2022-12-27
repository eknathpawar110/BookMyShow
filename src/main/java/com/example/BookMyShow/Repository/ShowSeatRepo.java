package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Model.ShowSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepo extends JpaRepository<ShowSeatEntity,Integer> {
}
