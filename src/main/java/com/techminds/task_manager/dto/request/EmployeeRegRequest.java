package com.techminds.task_manager.dto.request;

import com.techminds.task_manager.entity.enums.EmployeeRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeRegRequest {

    @NotBlank(message = "Employee ID is mandatory")
    private String employeeId;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password is mandatory")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    @NotBlank(message = "Department ID is mandatory")
    private Integer departmentHrId;

    @NotBlank(message = "Position ID is mandatory")
    private Integer positionHr;

    private LocalDate registeredDate;

    @NotBlank(message = "Role/Status is mandatory")
    private EmployeeRole status;

    private String reportingToEmployeeId;
}
