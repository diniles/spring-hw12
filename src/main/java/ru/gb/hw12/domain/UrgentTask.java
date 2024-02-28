package ru.gb.hw12.domain;

import org.springframework.stereotype.Service;
import ru.gb.hw12.entity.Task;

@Service
public class UrgentTask implements TaskFactory {
    @Override
    public Task createTask(String title) {
        return new Task().setUrgency(true).setTitle(title);
    }
}
