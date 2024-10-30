package org.example.dataanalysis.entities;

import java.util.UUID;

public class TaskEntity {
    private UUID id;
    private String title;
    private String description;

    public TaskEntity(String Title, String Description) {
        this.id = UUID.randomUUID();
        this.title = Title;
        this.description = Description;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return String.format("Id: %s, Title: %s, Description: %s", title, description);
    }
}
