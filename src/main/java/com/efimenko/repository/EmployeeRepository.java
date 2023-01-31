package com.efimenko.repository;

import com.efimenko.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
