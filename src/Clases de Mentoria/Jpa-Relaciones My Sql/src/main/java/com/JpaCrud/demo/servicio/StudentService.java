package com.JpaCrud.demo.servicio;

import com.JpaCrud.demo.modelo.Student;

import java.util.List;

public interface StudentService {




        Student findById(Long id);

        Student create(Student student);

        Student update(Long id, Student student);

        Boolean delete(Long id);


}
