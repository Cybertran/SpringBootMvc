package com.tacme.test.service;

import com.tacme.test.entity.Employee;

import java.util.List;

public interface EmployeeService {
   
   public List<Employee> findAll();

   public Employee getById(Long id);

   public void createEmployee(Employee emp);

   public void updateEmployee(Employee emp);

}
