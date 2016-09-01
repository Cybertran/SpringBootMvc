package com.tacme.test.service.impl;

import com.tacme.test.entity.Student;
import com.tacme.test.repository.StudentRepository;
import com.tacme.test.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class StudentServiceImpl implements StudentService {
   
   @Autowired
   StudentRepository studentRepository;
   
   @Override
   public List<Student> getAllStudent(){
      return studentRepository.findAll();
   }

   @Override
   @Transactional
   public void createStudent(Student student) {
      studentRepository.save(student);
      
   }

   @Override
   public Student getById(Long id) {
      return studentRepository.findById(id);
   }

}
