package com.demo.allinallJPA.repository;

import com.demo.allinallJPA.domain.Passport;
import com.demo.allinallJPA.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class StudentRepo {
    @Autowired
    EntityManager em;

    public void savePass()
    {
        Passport passport = new Passport("AS17382");
        em.persist(passport);
        Student student = new Student("tyson");
        student.setPassport(passport);
        em.persist(student);
    }
}
