package br.fa7.exercicios.resource;

import br.fa7.exercicios.entity.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jackson on 4/18/16.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
