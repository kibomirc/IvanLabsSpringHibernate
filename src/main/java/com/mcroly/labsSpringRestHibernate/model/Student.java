package com.mcroly.labsSpringRestHibernate.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Student")
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

    @OneToMany(
            mappedBy = "student",  // si mette il nome del oggetto della classe Telefono (in questo caso)
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Telefono> numbers = new ArrayList<>();

    public Materia getMat() {
        return mat;
    }

    public void setMat(Materia mat) {
        this.mat = mat;
    }

    public List<Telefono> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Telefono> numbers) {
        this.numbers = numbers;
    }

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
