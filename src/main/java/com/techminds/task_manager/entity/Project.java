package com.techminds.task_manager.entity;

import com.techminds.task_manager.entity.enums.ApprovalStatus;
import com.techminds.task_manager.entity.enums.ProjectStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255, nullable = false)
    private String taskName;

    private int Priority = 0;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private ProjectStatus status = ProjectStatus.PENDING;

    private LocalDateTime completedDate;

    @Lob
    private String remarks;

    private boolean isOnHold = false;

    private LocalDateTime holdStartDate;

    private Long totalHoldDuration = 0L;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private ApprovalStatus approvedStatus = ApprovalStatus.PENDING;

    private LocalDateTime approvedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_id")
    private Employee createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approved_by_id")
    private Employee approvedBy;

    @OneToMany(mappedBy = "taskList", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> tasks;
}
