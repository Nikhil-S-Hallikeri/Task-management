package com.techminds.task_manager.repository;

import com.techminds.task_manager.entity.Project;
import com.techminds.task_manager.entity.ProjectHistory;
import com.techminds.task_manager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory , Long> {
    List<ProjectHistory> findByProjectOrderByCreatedAtDesc(Project project);
    List<ProjectHistory> findByTaskOrderByCreatedAtDesc(Task task);
}
