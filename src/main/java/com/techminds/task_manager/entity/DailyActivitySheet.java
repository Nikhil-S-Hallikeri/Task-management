package com.techminds.task_manager.entity;

import com.techminds.task_manager.entity.enums.ProjectStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "activity_sheets")
public class DailyActivitySheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    private String assignedTime;
    private String estimatedCompletedTime;

    @Lob
    private String actionPlanned;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private ProjectStatus actionAchieved;

    @Lob
    private String actionChanged;

    @Lob
    private String remarks;

    @Lob
    private String remarks2;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    private Task task;
}
