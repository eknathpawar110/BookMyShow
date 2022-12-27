package com.example.BookMyShow.Service;

import com.example.BookMyShow.dto.UserDto;


public interface UserService {


    // add user
    public void addUser(UserDto userDto);

    //get user
    public UserDto getUser(int id);

}
