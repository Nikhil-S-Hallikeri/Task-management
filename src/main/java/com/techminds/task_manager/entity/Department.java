package com.techminds.task_manager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dept_name",nullable = false)  //nullable = false for column cannot be null in database and generate NOT NULL constraint
    private String departmentName;

    @Column(name = "hr_id" , unique = true)
    private int hrId;
}
