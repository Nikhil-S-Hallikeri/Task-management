package com.techminds.task_manager.service.impl;

import com.techminds.task_manager.dto.request.EmployeeRegRequest;
import com.techminds.task_manager.entity.Employee;
import com.techminds.task_manager.repository.DepartmentRepository;
import com.techminds.task_manager.repository.EmployeeRepository;
import com.techminds.task_manager.repository.PositionRepository;
import com.techminds.task_manager.service.EmployeeService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;
    private final PositionRepository positionRepository;
    private final PasswordEncoder passwordEncoder;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository,
                               DepartmentRepository departmentRepository,
                               PositionRepository positionRepository,
                               PasswordEncoder passwordEncoder) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.positionRepository = positionRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    @Transactional
    public Employee registerEmployee(EmployeeRegRequest request) {
        return null;
    }
}