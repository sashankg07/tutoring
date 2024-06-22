package com.nivesha.tutoring.controller;

import com.nivesha.tutoring.dal.Login;
import com.nivesha.tutoring.dal.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

    private final LoginRepository studentService;
    @Autowired
    public LoginController(LoginRepository serviceLayer) {
        this.studentService = serviceLayer;
    }

    /**
     * Create a new product.
     *
     * @param login the student to create
     * @return the ResponseEntity with status 200 (OK) and with body of the new product
     */
    @PostMapping("/student")
    public ResponseEntity<Login> saveStudent(@RequestBody Login login) {
        Login newLogin = studentService.save(login);
        return ResponseEntity.ok(newLogin);
    }

    /**
     * Get all students.
     *
     * @return the ResponseEntity with status 200 (OK) and with body of the list of products
     */
    @GetMapping("/students")
    public List<Login> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/student/{id}")
    public Optional<Login> getAllStudents(@PathVariable("id") long id) {
        return studentService.findById(id);
    }


}
