package com.example.employee.service;

import com.example.employee.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee save(Employee emp);
    List<Employee> getAll();
    Employee getById(Long id);
    void delete(Long id);
}
