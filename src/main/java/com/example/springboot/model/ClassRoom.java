package com.example.springboot.model;

import lombok.Data;
import lombok.SneakyThrows;

import java.util.Calendar;
import java.util.List;
import java.util.ResourceBundle;

@Data
public class ClassRoom {

    private Long id;
    private List<Student> students;
    private List<Subject> subjectList;
    Student student = new Student();
}
