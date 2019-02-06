package com.mcroly.labsSpringRestHibernate.repositories;

import java.util.List;

import com.mcroly.labsSpringRestHibernate.model.Tag;

public interface TagRepository {

    List<Tag> findAll();

}