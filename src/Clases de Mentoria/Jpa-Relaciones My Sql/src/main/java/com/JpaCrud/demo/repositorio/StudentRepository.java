package com.JpaCrud.demo.repositorio;

import com.JpaCrud.demo.modelo.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> findAll();

    Student findById(Long id);

    Student create(Student student);

    Student update(Long id, Student student);

    Boolean delete(Long id);

}
