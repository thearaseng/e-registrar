package edu.miu.swe.eregistrar.service.impl;

import edu.miu.swe.eregistrar.model.Student;
import edu.miu.swe.eregistrar.repository.StudentRepository;
import edu.miu.swe.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public Student findById(Long id) {
        return this.studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        this.studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }

}
