package org.fa7.spring.trabalho_fa7.service;

import org.fa7.spring.trabalho_fa7.entity.Address;
import org.fa7.spring.trabalho_fa7.entity.Employee;
import org.fa7.spring.trabalho_fa7.resource.AddressRepository;
import org.fa7.spring.trabalho_fa7.resource.EmployeeRepository;
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
