package com.example.BookMyShow.dto;


import lombok.*;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int id;
    @NonNull
    private String name;
    @NonNull
    private String mobile;
}
