package com.example.jessikatibblin.roomdatabasetut;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String descriptin;
    private int priority;

    public Note(String title, String descriptin, int priority) {
        this.title = title;
        this.descriptin = descriptin;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescriptin() {
        return descriptin;
    }

    public int getPriority() {
        return priority;
    }


}
