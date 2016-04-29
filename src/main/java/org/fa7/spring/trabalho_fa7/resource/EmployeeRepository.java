package org.fa7.spring.trabalho_fa7.resource;

import org.fa7.spring.trabalho_fa7.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jackson on 4/18/16.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
