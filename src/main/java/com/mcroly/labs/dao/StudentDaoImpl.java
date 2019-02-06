package com.mcroly.labs.dao;

import com.mcroly.labs.model.Materia;
import com.mcroly.labs.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@Repository
public class StudentDaoImpl {


    @PersistenceContext
    private EntityManager session;

    @Transactional
    public String StudentPersist() {

        Materia materia = new Materia();

        materia.setName("Elettronica Analogica");
        materia.setVoto("28");


        session.persist(materia);

        Student student = new Student();
        student.setName("Ivan");
        student.setPassportNumber("1233456789");
        student.setMateria(materia);

        session.persist(student);



        return "ciao";
    }
}
