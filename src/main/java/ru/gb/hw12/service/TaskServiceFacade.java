package ru.gb.hw12.service;

import ru.gb.hw12.domain.TaskSubject;
import ru.gb.hw12.entity.Task;

import java.util.List;

public interface TaskServiceFacade extends TaskSubject {
    Task createTask(Task task);

    Task updateTask(Long taskId, String title, boolean completed, boolean urgency);

    boolean deleteTask(Long taskId);

    Task getTask(Long taskId);

    List<Task> getTasks();
}
