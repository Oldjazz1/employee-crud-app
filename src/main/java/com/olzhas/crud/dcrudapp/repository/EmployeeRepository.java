package com.olzhas.crud.dcrudapp.repository;

import com.olzhas.crud.dcrudapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
