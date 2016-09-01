package com.tacme.test.service.impl;

import com.tacme.test.entity.Employee;
import com.tacme.test.repository.EmployeeRepository;
import com.tacme.test.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
   
@Autowired
EmployeeRepository employeeRepository;

@Override
public List<Employee> findAll() {
   return employeeRepository.findAll();
}

@Override
public Employee getById(Long id) {
   return employeeRepository.getOne(id);
}

@Override
@Transactional
public void createEmployee(Employee emp) {
   employeeRepository.save(emp);
   
}

@Override
@Transactional
@Modifying
public void updateEmployee(Employee emp) {
   employeeRepository.saveAndFlush(emp); 
}

}
