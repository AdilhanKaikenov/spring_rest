package com.kaikenov.spring.rest.service;

import com.kaikenov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee getEmployee(int id);

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public void deleteEmployee(int id);
}
