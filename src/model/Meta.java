package model;

import java.time.LocalDate;

public class Meta implements IMeta {

    private final String description;
    private final int priority;
    private final LocalDate deadline;
    private boolean completed;

    public Meta(String description, int priority, LocalDate deadline) {
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
        this.completed = false;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }

    @Override
    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public void markAsCompleted() {
        this.completed = true;
    }
}
