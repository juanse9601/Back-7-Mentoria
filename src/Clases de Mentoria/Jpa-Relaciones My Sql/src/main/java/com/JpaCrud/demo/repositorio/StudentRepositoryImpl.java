package com.JpaCrud.demo.repositorio;

import com.JpaCrud.demo.modelo.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{

    private StudentJpaRepository studentJpaRepository;

    @Autowired
    public StudentRepositoryImpl(StudentJpaRepository studentJpaRepository){
       this.studentJpaRepository = studentJpaRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentJpaRepository.findAll().size()>0 ? studentJpaRepository.findAll() :null;
    }

    @Override
    public Student findById(Long id) {
        return studentJpaRepository.findById(id).isPresent() ? studentJpaRepository.findById(id).get() :null;
    }

    @Override
    public Student create(Student student) {
        return studentJpaRepository.save(student);
    }

    @Override
    public Student update(Long id, Student student) {
        Student studentFound = findById(id);
        if (studentFound != null){
            studentFound.setFirstName(student.getFirstName());
            studentFound.setLastName(student.getLastName());
            studentFound.setBirthDate(student.getBirthDate());
            return studentJpaRepository.save(studentFound);
        }else{
            return null;
        }
    }

    @Override
    public Boolean delete(Long id) {
        Student studentFound = findById(id);
        if (studentFound != null){
            studentJpaRepository.delete(studentFound);
            return true;
        } else{
            return false;
        }
    }
}
