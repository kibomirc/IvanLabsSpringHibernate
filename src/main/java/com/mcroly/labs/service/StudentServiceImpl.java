package com.mcroly.labs.service;

import com.mcroly.labs.dao.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("bcStudent")
@Transactional
public class StudentServiceImpl {

    @Autowired
    StudentDaoImpl daoStudent;

    public void persistService() {
        daoStudent.StudentPersist();
    }
}
