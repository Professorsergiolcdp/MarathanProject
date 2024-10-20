package com.example.springboot.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.SneakyThrows;

import java.time.LocalDate;
import java.util.Map;

@Entity
@Data
public class Student implements Cloneable{

    private Long id;
    private String name;
    private String email;
    private ClassRoom classRoom;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    @Override
    @SneakyThrows
    public Student clone() {
        super.clone();
        return new Student();
    }
}
