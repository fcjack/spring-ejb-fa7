package br.fa7.exercicios.service;

import br.fa7.exercicios.entity.Address;
import br.fa7.exercicios.entity.Employee;
import br.fa7.exercicios.resource.AddressRepository;
import br.fa7.exercicios.resource.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jackson on 4/18/16.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.delete(id);
    }

    @Override
    public List<Employee> list() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public Address findAddressByIdForEmployee(Long employeeId, Long addressId) {
        Employee employee = findById(employeeId);
        if (employee != null) {
            for (Address address : employee.getAddress()) {
                if (address.getId().equals(addressId)) return address;
            }
        }

        return null;
    }
}
