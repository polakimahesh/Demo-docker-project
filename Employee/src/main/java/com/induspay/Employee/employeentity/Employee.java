package com.induspay.Employee.employeentity;

import com.induspay.Employee.employeentity.dto.EmployeeDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(int i, String name, double v) {
        this.id = i;
        this.name = name;
        this.salary = v;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(EmployeeDto employeeDto) {
        this.name = employeeDto.getName();
        this.salary = employeeDto.getSalary();
    }
}
