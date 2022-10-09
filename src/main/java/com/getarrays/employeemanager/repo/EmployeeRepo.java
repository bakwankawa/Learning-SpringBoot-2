package com.getarrays.employeemanager.repo;

import com.getarrays.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    // this called query method, spring will understand what we want
    void deleteEmployeeById(Long id); // param is class and id type

    // this called query method, spring will understand what we want
    // and because this is optional, sometimes the id given not present
    // we add optional
    Optional<Employee> findEmployeeById(Long id);
}
