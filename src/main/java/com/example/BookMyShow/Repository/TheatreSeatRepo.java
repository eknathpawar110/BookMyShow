package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Model.TheatreSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreSeatRepo extends JpaRepository<TheatreSeatEntity,Integer> {
}
