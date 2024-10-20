package com.example.springboot.model;

import lombok.Data;
import lombok.SneakyThrows;

import java.time.LocalDate;
import java.util.Map;

@Data
public class Student{

    private Long id;

    private String name;
    private String email;
    private ClassRoom classRoom;
    private LocalDate createdAt;
    private LocalDate updatedAt;

}
