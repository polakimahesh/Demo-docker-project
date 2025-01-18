package com.induspay.Employee.employee;

import com.induspay.Employee.employeentity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query("select e from Employee e order by e.salary DESC")
    List<Employee> findByOrderBySalaryDesc();


}
