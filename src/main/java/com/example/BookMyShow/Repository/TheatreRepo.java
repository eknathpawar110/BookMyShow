package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Model.TheatreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepo extends JpaRepository<TheatreEntity,Integer> {
}
