package com.techminds.task_manager.repository;

import com.techminds.task_manager.entity.EmailNotification;
import com.techminds.task_manager.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmailNotificationRepository extends JpaRepository<EmailNotification, Long> {
    List<EmailNotification> findByEmployeeAndVisibleStatusTrueOrderByCreatedAtDesc(Employee employee);
}
