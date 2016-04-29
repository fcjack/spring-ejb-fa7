package org.fa7.spring.trabalho_fa7.controller;

import org.fa7.spring.trabalho_fa7.entity.Address;
import org.fa7.spring.trabalho_fa7.entity.Employee;
import org.fa7.spring.trabalho_fa7.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by jackson on 4/18/16.
 */
@RestController
@RequestMapping("clientes")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping
    public List<Employee> list() {
        return employeeService.list();
    }
    
    @RequestMapping(value = "{id}")
    public Employee findById(@PathVariable Long id) {
    	return employeeService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Employee employee) {
        employeeService.save(employee);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public void update(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        employeeService.save(employee);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        employeeService.delete(id);
    }

    @RequestMapping("{id}/enderecos")
    public List<Address> getAddressByEmployee(@PathVariable Long id) {
        Employee employee = employeeService.findById(id);
        if (employee != null) {
            return employee.getAddress();
        }

        return null;
    }

    @RequestMapping("{id}/enderecos/{eid}")
    public Address getAddressById(@PathVariable Long id, @PathVariable Long eid, HttpServletResponse response) throws IOException {
        Address address = employeeService.findAddressByIdForEmployee(id, eid);
        if (address != null) return address;
        return null;
    }
}
