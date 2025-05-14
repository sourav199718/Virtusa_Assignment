
package com.example.newapp.controller;
import com.example.newapp.entity.Employee;
import com.example.newapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee-list")
    public String employeeList() {
        return "employee-list"; // assumes employee-list.html exists
    }


    @PostMapping
    public String addEmployee(@RequestBody Employee emp) {
        employeeService.saveEmployee(emp);
        return "employee-list";
    }
    @PutMapping
    public String updateEmployee(@RequestBody Employee emp) {
        employeeService.saveEmployee(emp);
        return "employee-list";
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
