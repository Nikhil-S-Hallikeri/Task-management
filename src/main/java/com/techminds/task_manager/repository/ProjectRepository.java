package com.techminds.task_manager.repository;

import com.techminds.task_manager.entity.Employee;
import com.techminds.task_manager.entity.Project;
import com.techminds.task_manager.entity.enums.ProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project , Long> {
    List<Project> findbyCreatedBy(Employee creator);
    List<Project> findByStatus(ProjectStatus status);
}
