package com.example.BookMyShow.Service;


public interface UserService {


    // add user
    public void addUser(EntryDto.UserDto userDto);

    //get user
    public EntryDto.UserDto getUser(int id);

}
