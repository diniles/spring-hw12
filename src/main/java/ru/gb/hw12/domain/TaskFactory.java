package ru.gb.hw12.domain;

import ru.gb.hw12.entity.Task;

public interface TaskFactory {
    Task createTask(String title);
}
