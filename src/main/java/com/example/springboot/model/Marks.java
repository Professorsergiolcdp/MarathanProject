package com.example.springboot.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Marks {

    private Long id;
    private Student student;
    private Subject subject;
    private Long gradesObtained;

}
