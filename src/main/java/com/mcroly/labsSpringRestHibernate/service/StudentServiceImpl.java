package com.mcroly.labsSpringRestHibernate.service;

import com.mcroly.labsSpringRestHibernate.dao.StudentDaoImpl;
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
