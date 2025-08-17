package com.springpractice.springoverviewdemo.dao;

import com.springpractice.springoverviewdemo.entity.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class EmployeeRepositoryTest {

    private Employee testEmployee;

    @Autowired
    private EmployeeRepository employeeRepository;

    @BeforeEach
    public void setUp() {
        testEmployee = new Employee("John", "Smith", "john.smith@test.test");
        this.employeeRepository.save(testEmployee);
    }

    @AfterEach
    public void tearDown() {
        this.employeeRepository.deleteAll();
    }

    @Test
    public void canBeFindById() {
        Optional<Employee> savedEmployee = this.employeeRepository.findById(testEmployee.getId());
        assertNotNull(savedEmployee);
        assertEquals(savedEmployee.get().getFirstName(), testEmployee.getFirstName());
        assertEquals(savedEmployee.get().getLastName(), testEmployee.getLastName());
        assertEquals(savedEmployee.get().getEmail(), testEmployee.getEmail());
    }

    @Test
    public void canUpdateEmployee() {
        testEmployee.setFirstName("John1");
        this.employeeRepository.save(testEmployee);

        Optional<Employee> updatedEmployee = this.employeeRepository.findById(testEmployee.getId());
        assertNotNull(updatedEmployee);
        assertEquals(updatedEmployee.get().getFirstName(), testEmployee.getFirstName());
    }

}
