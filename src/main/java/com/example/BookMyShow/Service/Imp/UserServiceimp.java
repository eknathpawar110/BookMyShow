package com.example.BookMyShow.Service.Imp;


import com.example.BookMyShow.Converter.UserConverter;
import com.example.BookMyShow.Model.UserEntity;
import com.example.BookMyShow.Repository.UserRepo;
import com.example.BookMyShow.Service.UserService;
import com.example.BookMyShow.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.BookMyShow.Converter.UserConverter.dtoToEntity;
import static com.example.BookMyShow.Converter.UserConverter.entityToDTO;

@Service
public class UserServiceimp implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public void addUser(UserDto userDto) {
        UserEntity userEntity= dtoToEntity(userDto);
        userRepo.save(userEntity);
    }

    @Override
    public UserDto getUser(int id) {
        UserEntity user=userRepo.findById(id).get();
        return entityToDTO(user);
    }
}
