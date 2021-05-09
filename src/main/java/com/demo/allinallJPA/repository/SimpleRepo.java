package com.demo.allinallJPA.repository;

import com.demo.allinallJPA.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class SimpleRepo {
    @Autowired
    EntityManager em;

    public Course findById(Long id)
    {
        return em.find(Course.class,id);
    }
}
