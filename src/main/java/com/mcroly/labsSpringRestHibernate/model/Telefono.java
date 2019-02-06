package com.mcroly.labsSpringRestHibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "Telefono")
public class Telefono {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="TELEFONO_ID")
    private Long id;
    @Column(name="TELEFONO")
    private String telefono;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}