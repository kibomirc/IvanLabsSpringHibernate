package com.mcroly.labs.repositories;

import java.util.List;

import com.mcroly.labs.model.Tag;

public interface TagRepository {

    List<Tag> findAll();

}