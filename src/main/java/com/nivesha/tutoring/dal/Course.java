package com.nivesha.tutoring.dal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long courseId;

    @Column(nullable = false)
    private String catalogId;

    @Column(nullable = false)
    private String startDate;

    @Column(nullable = false)
    private String endDate;

    @Column(nullable = false)
    private String instructorId;

    public Course(){
    }
    public Course(String catalogId, String startDate, String endDate, String instructorId) {
        this.catalogId = catalogId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.instructorId = instructorId;
    }

}
