package com.techminds.task_manager.entity;

import com.techminds.task_manager.entity.enums.EmployeeRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "employees")
@ToString(exclude = {"reportees" , "reportingTo"})  //Prevents infinite loop on logging
@EqualsAndHashCode(exclude = {"reportees" , "reportingTo"})  //Prevents infinite loop on comparisons of Emp Objects
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 100)
    private String employeeId;

    private String name;

    @Column(unique = true , length = 100 , nullable = false)
    private String email;

    @Column(length = 300 , nullable = false)
    private String password;

    private LocalDate registeredDate;

    private boolean loggedIn = false;

    private String profilePicUrl;  //database will store picture url/path to the image

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private EmployeeRole status;

    private boolean bookedStatus = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id")
    private Position position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reporting_to_id")
    private Employee reportingTo;

    @OneToMany(mappedBy = "reportingTo") //Used on the manager side
    private List<Employee> reportees;
}
