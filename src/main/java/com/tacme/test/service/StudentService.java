package com.tacme.test.service;

import com.tacme.test.entity.Student;

import java.util.List;

public interface StudentService {
   
   List<Student> getAllStudent();
   public void createStudent(Student student);
   public  Student getById(Long id);

}
