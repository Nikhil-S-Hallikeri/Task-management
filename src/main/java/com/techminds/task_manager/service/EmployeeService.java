package com.techminds.task_manager.service;

import com.techminds.task_manager.dto.request.EmployeeRegRequest;
import com.techminds.task_manager.entity.Employee;

public interface EmployeeService {
    Employee registerEmployee (EmployeeRegRequest request);
}
