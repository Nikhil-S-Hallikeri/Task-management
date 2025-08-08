package com.techminds.task_manager.repository;

import com.techminds.task_manager.entity.Employee;
import com.techminds.task_manager.entity.SubTaskAssign;
import com.techminds.task_manager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubTaskAssignRepository extends JpaRepository<SubTaskAssign , Long> {
    List<SubTaskAssign> findByAssignedTo(Employee employee);
    List<SubTaskAssign> findByTask(Task task);
}
