package ru.gb.hw12.domain;

import org.springframework.stereotype.Repository;
import ru.gb.hw12.entity.Task;

@Repository
public class NormalTask implements TaskFactory {
    @Override
    public Task createTask(String title) {
        return new Task().setUrgency(false).setTitle(title);
    }
}
