package com.example.BookMyShow.Repository;

import com.example.BookMyShow.Model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<MovieEntity,Integer> {

}
