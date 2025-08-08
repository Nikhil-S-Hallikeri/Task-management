package com.techminds.task_manager.repository;

import com.techminds.task_manager.entity.Employee;
import com.techminds.task_manager.entity.Project;
import com.techminds.task_manager.entity.TaskAssignToEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskAssignToEmployeeRepository extends JpaRepository<TaskAssignToEmployee , Long> {
    List<TaskAssignToEmployee> findByEmployee(Employee employee);

    Optional<TaskAssignToEmployee> findByProjectAndEmployee(Project project, Employee employee);
}
