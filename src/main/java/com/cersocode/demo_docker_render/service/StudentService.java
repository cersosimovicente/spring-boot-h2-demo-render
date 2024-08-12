package com.cersocode.demo_docker_render.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cersocode.demo_docker_render.entity.Student;
import com.cersocode.demo_docker_render.repository.StudentRepository;
import java.util.List;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;


    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public Student getStudent(@PathVariable Long id) {
        return studentRepository.findById(id).orElse(null);
    }

}
