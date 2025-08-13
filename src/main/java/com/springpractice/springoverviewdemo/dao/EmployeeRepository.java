package com.springpractice.springoverviewdemo.dao;

import com.springpractice.springoverviewdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
