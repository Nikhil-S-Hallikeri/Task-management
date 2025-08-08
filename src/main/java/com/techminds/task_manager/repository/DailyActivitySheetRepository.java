package com.techminds.task_manager.repository;

import com.techminds.task_manager.entity.DailyActivitySheet;
import com.techminds.task_manager.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DailyActivitySheetRepository extends JpaRepository<DailyActivitySheet , Long> {
    List<DailyActivitySheet> findByEmployeeAndDate(Employee employee , LocalDate date);
    List<DailyActivitySheet> findByEmployeeAndDateBetween(Employee employee,LocalDate startdate , LocalDate endDate);
}
