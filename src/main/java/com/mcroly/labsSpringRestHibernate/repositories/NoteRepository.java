package com.mcroly.labsSpringRestHibernate.repositories;

import java.util.List;

import com.mcroly.labsSpringRestHibernate.model.Note;

public interface NoteRepository {

    List<Note> findAll();

}