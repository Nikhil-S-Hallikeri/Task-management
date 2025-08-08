package com.techminds.task_manager.repository;

import com.techminds.task_manager.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PositionRepository extends JpaRepository<Position , Long> {
    Optional<Position> findByHrId(Long hrId);
}
