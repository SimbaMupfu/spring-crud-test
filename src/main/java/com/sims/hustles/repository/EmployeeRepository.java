package com.sims.hustles.repository;

import com.sims.hustles.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
