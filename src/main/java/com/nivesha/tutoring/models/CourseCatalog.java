package com.nivesha.tutoring.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "course")
public class CourseCatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long catalogId;

    @Column(nullable = false)
    private String courseName;

    @Column(nullable = false)
    private String syllabus;

    public CourseCatalog(){
    }
    public CourseCatalog(String courseName, String syllabus) {
        this.courseName = courseName;
        this.syllabus = syllabus;
    }

}
