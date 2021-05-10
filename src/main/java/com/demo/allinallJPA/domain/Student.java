package com.demo.allinallJPA.domain;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String name;

    @OneToOne
    public Passport passport;

    public Student()
    {

    }

    public Student(String name) {
        this.name = name;
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

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
