package org.example.dataanalysis.entities;

import java.time.LocalDate;
import java.util.UUID;

public class GradeEntity {
    private UUID id;
    private StudentEntity student;
    private TaskEntity task;
    private int score;
    private LocalDate date;

    public GradeEntity(StudentEntity student, TaskEntity task, int score, LocalDate date) {
        this.id = UUID.randomUUID();
        this.student = student;
        this.task = task;
        this.score = score;
        this.date = date;
    }

    public UUID getId() { return id; }
    public StudentEntity getStudent() { return student; }
    public TaskEntity getTask() { return task; }
    public int getScore() { return score; }
    public LocalDate getDate() { return date; }

    public void setId(UUID id) { this.id = id; }
    public void setStudent(StudentEntity student) { this.student = student; }
    public void setTask(TaskEntity task) { this.task = task; }
    public void setScore(int score) { this.score = score; }
    public void setDate(LocalDate date) { this.date = date; }
}
