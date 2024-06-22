package com.nivesha.tutoring.dal;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String emailId;

    @Column(nullable = false)
    private String password;

    public Login(){
    }
    public Login(String first, String last, String emailId, String password, String grade) {
        this.emailId = emailId;
        this.password = password;
        this.firstName = first;
        this.lastName = last;
    }

}
