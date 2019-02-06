package com.mcroly.labs.repositories;

import java.util.List;

import com.mcroly.labs.model.Note;

public interface NoteRepository {

    List<Note> findAll();

}