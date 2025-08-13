package com.springpractice.springoverviewdemo.service;

import com.springpractice.springoverviewdemo.dao.EmployeeDAO;
import com.springpractice.springoverviewdemo.dao.EmployeeRepository;
import com.springpractice.springoverviewdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    //private EmployeeDAO employeeDAO;
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = this.employeeRepository.findById(id);

        Employee savedEmployee = null;
        if(result.isPresent()) {
            savedEmployee = result.get();
        } else {
            throw new RuntimeException("Employee with id " + id + " not found");
        }

        return savedEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        this.employeeRepository.deleteById(id);
    }


}
