package com.nivesha.tutoring.dal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    private long id;

    @Column(nullable = false)
    private String grade;

    @Column(nullable = false)
    private String testScores;

    public Student(){
    }
    public Student(Long id, String grade, String testScores) {

        this.id = id;
        this.grade = grade;
        this.testScores = testScores;

    }

}
