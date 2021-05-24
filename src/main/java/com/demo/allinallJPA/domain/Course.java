package com.demo.allinallJPA.domain;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String name;

    @CreationTimestamp
    public LocalDateTime createdTime;

    @UpdateTimestamp
    public LocalDateTime lastUpdatedTime;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "course")
    public List<Review> reviews = new ArrayList<>();

    @ManyToMany
    public List<Student> students = new ArrayList<>();

    public Course() {
    }

    public Course(Long id, String name, LocalDateTime createdTime, LocalDateTime lastUpdatedTime) {
        this.id = id;
        this.name = name;
        this.createdTime = createdTime;
        this.lastUpdatedTime = lastUpdatedTime;

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

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(LocalDateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public void addReview(Review review)
    {
        this.reviews.add(review);
    }
    public void removeReview(Review review)
    {
        this.reviews.remove(review);
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student students) {
        this.students.add(students);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdTime=" + createdTime +
                ", lastUpdatedTime=" + lastUpdatedTime +
                ", review: "+reviews +
                '}';
    }


}
