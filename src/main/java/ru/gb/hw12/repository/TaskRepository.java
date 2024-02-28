package ru.gb.hw12.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.hw12.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
