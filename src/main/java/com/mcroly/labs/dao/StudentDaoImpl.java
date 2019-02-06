package com.mcroly.labs.dao;

import com.mcroly.labs.model.Materia;
import com.mcroly.labs.model.Student;
import com.mcroly.labs.model.Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import java.util.ArrayList;
import java.util.List;

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

        Telefono telefono_home = new Telefono();
        telefono_home.setTelefono("1236456789");
        telefono_home.setStudent(student);

        session.persist(telefono_home);

        Telefono telefono_mobile = new Telefono();
        telefono_mobile.setTelefono("123123123");
        telefono_mobile.setStudent(student);

        session.persist(telefono_mobile);

        return "ciao";
    }
}
