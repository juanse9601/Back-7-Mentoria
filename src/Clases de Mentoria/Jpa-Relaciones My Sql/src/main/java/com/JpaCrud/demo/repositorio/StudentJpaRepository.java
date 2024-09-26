package com.JpaCrud.demo.repositorio;

import com.JpaCrud.demo.modelo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentJpaRepository extends JpaRepository<Student, Long >{

    //Jpql

    @Query("SELECT e FROM student e JOIN e.course c WHERE c.name = :nombreCurso")
    List<Student> findEstudiantesPorNombreCurso(String nombreCurso);

}
