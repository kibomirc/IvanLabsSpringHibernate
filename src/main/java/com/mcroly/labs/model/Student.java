package com.mcroly.labs.model;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;
    @Column(name="USERNAME")
    private String name;
    @Column(name="NAME")
    private String passportNumber;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia mat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

   public Materia getMateria() {
        return mat;
    }

    public void setMateria(Materia materia) {
        this.mat = materia;
    }
}
