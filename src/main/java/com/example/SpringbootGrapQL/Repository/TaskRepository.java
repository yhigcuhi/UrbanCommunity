package com.example.SpringbootGrapQL.Repository;

import com.example.SpringbootGrapQL.Entities.user.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
