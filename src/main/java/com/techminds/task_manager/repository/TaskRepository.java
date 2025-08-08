package com.techminds.task_manager.repository;

import com.techminds.task_manager.entity.Project;
import com.techminds.task_manager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task , Long> {
    List<Task> findByTaskList(Project project);
}
