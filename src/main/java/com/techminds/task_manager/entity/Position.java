package com.techminds.task_manager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "positions")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "postion_name" , nullable = false ,length = 100)
    private String positionName;

    @Column(name = "dept_id")
    private Integer deptId;

    @Column(name = "hr_id" , unique = true)
    private Integer hrId;
}
