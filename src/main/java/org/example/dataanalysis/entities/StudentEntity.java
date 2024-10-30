package org.example.dataanalysis.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class StudentEntity {
    private final UUID id;
    private final String name;
    private final String surname;
    private final String group;
    public Map<String, Integer> courseGrades = new HashMap<>();

    public StudentEntity(String name, String surname, String group) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public void addGrade(String courseName, int grade) {
        courseGrades.put(courseName, grade);
    }

    public Integer getGrade(String courseName) {
        return courseGrades.get(courseName);
    }

    public Map<String, Integer> getCourseGrades() {
        return new HashMap<>(courseGrades);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return String.format("Id: %s, Name: %s, Surname: %s, Group: %s", id, name, surname, group);
    }

}
