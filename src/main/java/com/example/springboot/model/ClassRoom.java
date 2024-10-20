package com.example.springboot.model;

import lombok.SneakyThrows;

import java.util.Calendar;
import java.util.List;
import java.util.ResourceBundle;

public class ClassRoom {

    private Long id;
    private List<Student> students;
    private List<Subject> subjectList;
    Student student = new Student();

    @SneakyThrows
    public ClassRoom() {
        super.clone();
    }
}
