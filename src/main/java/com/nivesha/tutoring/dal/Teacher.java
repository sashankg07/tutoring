package com.nivesha.tutoring.dal;

import jakarta.persistence.*;

@Entity
@Table
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
    public Teacher(String mail, String pass) {
        email = mail;
        password = pass;
    }

}
