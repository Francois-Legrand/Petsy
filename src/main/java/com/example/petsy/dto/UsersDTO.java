package com.example.petsy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor          //NE PAS OUBLIER LE NoArgsConstructor
public class UsersDTO
{
    private String username;
}
