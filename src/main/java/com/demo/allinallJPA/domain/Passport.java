package com.demo.allinallJPA.domain;

import javax.persistence.*;

@Entity
public class Passport {
    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String number;

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "passport")
    public Student student;

    public Passport(){}

    public Passport(String number) {

        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
