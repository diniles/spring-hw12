package ru.gb.hw12.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.hw12.entity.Task;
import ru.gb.hw12.service.TaskServiceFacade;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskControllerImplementation implements TaskController {
    private final TaskServiceFacade taskServiceFacade;

    public TaskControllerImplementation(TaskServiceFacade taskServiceFacade) {
        this.taskServiceFacade = taskServiceFacade;
        taskServiceFacade.createObserver(task -> System.out.println("Task " + task + " updated "));
    }

    @Override
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = taskServiceFacade.createTask(task);
        return ResponseEntity.ok(createdTask);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@RequestBody Task task, @PathVariable("id") Long id) {
        Task updatedTask = taskServiceFacade.updateTask(id, task.getTitle(), task.isCompleted(), task.isUrgency());
        if (updatedTask == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedTask);
    }

    @Override
    @DeleteMapping("/{id}")
    public boolean deleteTask(@PathVariable("id") Long id) {
        return taskServiceFacade.deleteTask(id);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTask(@PathVariable("id") Long id) {
        Task task = taskServiceFacade.getTask(id);
        if (task == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(task);
    }

    @Override
    @GetMapping
    public List<Task> getTasks() {
        return taskServiceFacade.getTasks();
    }
}
