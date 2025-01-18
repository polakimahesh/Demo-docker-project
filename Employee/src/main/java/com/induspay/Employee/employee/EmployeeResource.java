package com.induspay.Employee.employee;

import com.induspay.Employee.employeentity.dto.EmployeeDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.induspay.Employee.employeentity.Employee;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeResource {
    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public ResponseEntity<Object> create(@RequestBody EmployeeDto employeeDto){
         employeeService.create(employeeDto);
         return ResponseEntity.status(HttpStatus.OK).body("Created Successfully!");
    }
    @GetMapping("/get-all-details")
    public ResponseEntity<Object> getAllDetails(){
       List<Employee> employeeList = employeeService.getAllDetails();
        return ResponseEntity.status(HttpStatus.OK).body(employeeList);
    }


}
