package com.induspay.Employee.employee;

import com.induspay.Employee.employeentity.dto.EmployeeDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import com.induspay.Employee.employeentity.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    @PostConstruct
    public void data(){
        List<Employee> employeeList = List.of(new Employee(101, "Mahesh", 200.0), new Employee(102, "Thanuja", 200.0),
                new Employee(103, "Sai", 200.0), new Employee(104, "Balaji", 200.0));
        employeeRepository.saveAll(employeeList);
    }



    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void create(EmployeeDto employeeDto) {
        Employee employee = new Employee(employeeDto);
        employeeRepository.save(employee);
    }


    public List<Employee> getAllDetails() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList.stream()
                .sorted((employee1, employee2) ->employee2.getSalary().compareTo(employee1.getSalary()) ).toList();
    }
}
