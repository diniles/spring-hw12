package ru.gb.hw12.controller;

import org.springframework.http.ResponseEntity;
import ru.gb.hw12.entity.Task;

import java.util.List;

public interface TaskController {
    ResponseEntity<Task> createTask(Task task);

    ResponseEntity<Task> updateTask(Task task, Long id);

    boolean deleteTask(Long id);

    ResponseEntity<Task> getTask(Long id);

    List<Task> getTasks();
}
