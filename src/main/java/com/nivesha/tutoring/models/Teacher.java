package com.nivesha.tutoring.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "student")
public class Teacher {

    @Id
    private long id;

    @Column(nullable = false)
    private String qualifications;

    public Teacher(long id, String qualifications) {
        this.id = id;
        this.qualifications = qualifications;
    }

}
