package com.example.BookMyShow.Service.Imp;

import com.example.BookMyShow.Converter.TheatreConverter;
import com.example.BookMyShow.Model.TheatreEntity;
import com.example.BookMyShow.Model.TheatreSeatEntity;
import com.example.BookMyShow.Repository.TheatreRepo;
import com.example.BookMyShow.Repository.TheatreSeatRepo;
import com.example.BookMyShow.Service.TheatreService;
import com.example.BookMyShow.dto.TheatreDto;
import com.example.BookMyShow.enums.SeatType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.BookMyShow.Converter.TheatreConverter.entityToDTO;

@Service
public class TheatreServiceImp implements TheatreService {

    @Autowired
    TheatreSeatRepo theatreSeatRepo;
    @Autowired
    TheatreRepo theatreRepo;


    @Override
    public void addTheatre(TheatreDto theatreDto) {
        TheatreEntity theatreEntity= TheatreConverter.dtoToEntity(theatreDto);

        List<TheatreSeatEntity> seats= createTheatreSeats();

        for(TheatreSeatEntity theatreSeatEntity: seats){
            theatreSeatEntity.setTheatreEntity(theatreEntity);
        }

        theatreRepo.save(theatreEntity);

    }

    public List<TheatreSeatEntity> createTheatreSeats(){
        List<TheatreSeatEntity>seats= new ArrayList<>();

        seats.add(getTheatreSeat("A10",100,SeatType.CLASSIC));
        seats.add(getTheatreSeat("A11",100,SeatType.CLASSIC));
        seats.add(getTheatreSeat("A12",100,SeatType.CLASSIC));

        seats.add(getTheatreSeat("B10",200,SeatType.PREMIUM));
        seats.add(getTheatreSeat("B11",200,SeatType.PREMIUM));
        seats.add(getTheatreSeat("B12",200,SeatType.PREMIUM));

        theatreSeatRepo.saveAll(seats);

        return seats;

    }

    public TheatreSeatEntity getTheatreSeat(String seatNo, int rate, SeatType seatType){
        return  TheatreSeatEntity.builder().SeatNo(seatNo).seatType(seatType).rate(rate).build();
    }

    @Override
    public TheatreDto getTheatre(int id) {
        TheatreEntity theatreEntity = theatreRepo.findById(id).get();
        return entityToDTO(theatreEntity);

    }
}
