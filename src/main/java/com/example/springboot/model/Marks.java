package com.example.springboot.model;


import lombok.Data;

@Data
public class Marks {

    private Long id;
    private Student student;
    private Subject subject;
    private Long gradesObtained;

}
