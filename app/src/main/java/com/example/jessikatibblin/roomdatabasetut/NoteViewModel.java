package com.example.jessikatibblin.roomdatabasetut;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import java.util.List;
import java.util.ListIterator;

public class NoteViewModel extends AndroidViewModel {

    private  NoteRepository repository;
    private LiveData<List<Note>> allnotes;

    public NoteViewModel(@NonNull Application application) {
        super(application);
        repository = new NoteRepository(application);
        allnotes = repository.getAllNotes();
    }

    public void insert(Note note){
        repository.insert(note);
    }
    public void update(Note note){
        repository.update(note);
    }
    public void delete(Note note){
        repository.delete(note);
    }
    public void deleteAllNotes(){
        repository.deleteAllNotes();
    }

    public LiveData<List<Note>> getAllnotes(){
        return allnotes;
    }
}
