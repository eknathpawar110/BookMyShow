package com.example.BookMyShow.Service.Imp;

import com.example.BookMyShow.Converter.ShowConverter;
import com.example.BookMyShow.Model.*;
import com.example.BookMyShow.Repository.MovieRepo;
import com.example.BookMyShow.Repository.ShowRepo;
import com.example.BookMyShow.Repository.ShowSeatRepo;
import com.example.BookMyShow.Repository.TheatreRepo;
import com.example.BookMyShow.Service.ShowService;
import com.example.BookMyShow.dto.ShowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowServiceImp implements ShowService {

  @Autowired
    MovieRepo movieRepo;

  @Autowired
    TheatreRepo theatreRepo;
  @Autowired
    ShowRepo showRepo;

  @Autowired
    ShowSeatRepo showSeatRepo;

    @Override
    public ShowDto addShow(ShowDto showDto) {
        ShowEntity showEntity= ShowConverter.dtoTOEntity(showDto);

        MovieEntity movieEntity=movieRepo.findById(showDto.getMovieDto().getId()).get();
        showEntity.setMovie(movieEntity);

        TheatreEntity theatreEntity= theatreRepo.findById(showDto.getTheatreDto().getId()).get();
        showEntity.setTheatre(theatreEntity);
        List<ShowSeatEntity> seats = createShowSeatsEntity(theatreEntity.getSeats(),showEntity);
        showEntity.setSeats(seats);

        showRepo.save(showEntity);

        return showDto;
    }
    public List<ShowSeatEntity> createShowSeatsEntity(List<TheatreSeatEntity> theaterSeats,ShowEntity show){

        List<ShowSeatEntity> showSeats = new ArrayList<>();
        for(TheatreSeatEntity seat: theaterSeats){
            ShowSeatEntity showSeat = ShowSeatEntity.builder().id(seat.getId()).seatNumber(seat.getSeatNo()).
                    seatType(seat.getSeatType()).
                    show(show).
                    build();
            showSeats.add(showSeat);
        }

        showSeatRepo.saveAll(showSeats);
        return showSeats;
    }

    @Override
    public ShowDto grtShow(int id) {
        return null;
    }
}
