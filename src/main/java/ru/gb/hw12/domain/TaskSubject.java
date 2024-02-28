package ru.gb.hw12.domain;

import ru.gb.hw12.entity.Task;

public interface TaskSubject {
    void createObserver(TaskObserver observer);

    void deleteObserver(TaskObserver observer);

    void notifyObservers(Task event);
}
