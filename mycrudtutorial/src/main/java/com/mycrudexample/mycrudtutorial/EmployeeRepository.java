package com.mycrudexample.mycrudtutorial;

import com.mycrudexample.mycrudtutorial.net.javaguides.postgresql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
