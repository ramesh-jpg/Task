package com.Task.TaskMangementSystem.Repository;

import com.Task.TaskMangementSystem.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {


}
