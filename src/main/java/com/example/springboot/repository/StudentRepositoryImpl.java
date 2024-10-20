package com.example.springboot.repository;

import com.example.springboot.model.Student;

import java.util.Optional;

public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public <S extends Long> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Long> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Long> findById(Student student) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Student student) {
        return false;
    }

    @Override
    public Iterable<Long> findAll() {
        return null;
    }

    @Override
    public Iterable<Long> findAllById(Iterable<Student> students) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Student student) {

    }

    @Override
    public void delete(Long entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Student> students) {

    }

    @Override
    public void deleteAll(Iterable<? extends Long> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
