package edu.miu.swe.eregistrar.service;

import edu.miu.swe.eregistrar.model.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);

    Student findById(Long id);

    void deleteById(Long id);

    List<Student> findAll();
}
