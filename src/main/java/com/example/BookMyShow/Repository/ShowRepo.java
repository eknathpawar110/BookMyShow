package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Model.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepo extends JpaRepository<ShowEntity,Integer> {
}
