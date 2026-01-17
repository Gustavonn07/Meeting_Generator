package model;

import java.time.LocalDate;

public interface IMeta {

    String getDescription();

    int getPriority();

    boolean isCompleted();

    LocalDate getDeadline();

    void markAsCompleted();
}
