package com.JpaCrud.demo.servicio;

import com.JpaCrud.demo.modelo.Student;
import com.JpaCrud.demo.repositorio.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student create(Student student) {
        return studentRepository.create(student);
    }

    @Override
    public Student update(Long id, Student student) {
        return studentRepository.update(id,student);
    }

    @Override
    public Boolean delete(Long id) {
        return studentRepository.delete(id);
    }
}
