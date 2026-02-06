package com.google.studentapp.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stdId;

    @Column(name = "std_name")
    private String name;

    @Column(name = "std_marks")
    private Double marks;

    public Student() {
    }

    public Student(Integer stdId, String name, Double marks) {
        this.stdId = stdId;
        this.name = name;
        this.marks = marks;
    }

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }
}
