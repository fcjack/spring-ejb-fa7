package br.fa7.trabalho.service;

import br.fa7.trabalho.entity.Address;
import br.fa7.trabalho.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jackson on 4/18/16.
 */
@Service
public interface EmployeeService {

    void save(Employee employee);

    void delete(Long id);

    List<Employee> list();

    Employee findById(Long id);

    Address findAddressByIdForEmployee(Long employeeId, Long addressId);
}
