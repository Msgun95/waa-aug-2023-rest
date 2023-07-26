package com.Lab2ResfulWeb.lab2.Entiry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
   // private String coursesTaken;


    private List<Course> courselist;
}