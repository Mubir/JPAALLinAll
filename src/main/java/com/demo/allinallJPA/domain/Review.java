package com.demo.allinallJPA.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Review {
    @Id
    @GeneratedValue
    public Long id;

    public String rating;
    public String discription;

    public Review()
    {

    }

    public Review(String rating, String discription) {
        this.rating = rating;
        this.discription = discription;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", rating='" + rating + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }
}
