package com.tacme.test.controller;

import com.tacme.test.entity.Student;
import com.tacme.test.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoller {
   
   @Autowired
   StudentService studentService;
   
   @RequestMapping(value="/students",method=RequestMethod.GET)
   public ResponseEntity<?> getStudent(){
      List<Student> student = studentService.getAllStudent();
      return new ResponseEntity<>(student,HttpStatus.OK);
   }
   
   
   @RequestMapping(value="/student",method=RequestMethod.POST)
   public ResponseEntity<?> createStudent(@RequestBody Student student){
      studentService.createStudent(student);
      return new ResponseEntity<>(HttpStatus.OK);
   }
   
   @RequestMapping(value="/student/{id}",method=RequestMethod.GET)
   public ResponseEntity<?> student(@PathVariable(value="id")Long id){
      Student student = studentService.getById(id);
      if(student == null){
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(student,HttpStatus.OK);
   }


}
