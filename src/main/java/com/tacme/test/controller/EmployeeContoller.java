package com.tacme.test.controller;

import com.tacme.test.entity.Employee;
import com.tacme.test.service.EmployeeService;

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
public class EmployeeContoller {
   @Autowired
   EmployeeService employeeService;

   @RequestMapping(value="/employees",method=RequestMethod.GET)
   public ResponseEntity<?> getEmployees(){
      List<Employee> employees = employeeService.findAll();
      return new ResponseEntity<>(employees,HttpStatus.OK);
   }
   
   
   @RequestMapping(value="/employee",method=RequestMethod.POST)
   public ResponseEntity<?> createEmployee(@RequestBody Employee emp){
      employeeService.createEmployee(emp);
      return new ResponseEntity<>(HttpStatus.OK);
   }
   
   @RequestMapping(value="/employee/{id}",method=RequestMethod.GET)
   public ResponseEntity<?> getEmployee(@PathVariable(value="id")Long id){
      Employee employee = employeeService.getById(id);
      if(employee == null){
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(employee,HttpStatus.OK);
   }

}
