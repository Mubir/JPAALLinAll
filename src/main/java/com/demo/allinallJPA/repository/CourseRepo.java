package com.demo.allinallJPA.repository;

import com.demo.allinallJPA.domain.Course;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepo {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    EntityManager em;

    public Course findById(Long id)
    {
        return em.find(Course.class,id);
    }

    public void addReviewsForCourse() {

        //get course
        Course course = findById(123L);
        logger.info(""+course.getReviews());

    }
}
