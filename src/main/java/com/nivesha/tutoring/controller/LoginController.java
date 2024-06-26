package com.nivesha.tutoring.controller;

import com.nivesha.tutoring.dal.Login;
import com.nivesha.tutoring.dal.LoginRepository;
import com.nivesha.tutoring.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class LoginController {

    private final LoginService loginService;
    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * Create a new product.
     *
     * @param login the student to create
     * @return the ResponseEntity with status 200 (OK) and with body of the new product
     */
    @PostMapping("/student")
    public ResponseEntity<Object> saveStudent(@RequestBody Login login) {
        try {
            loginService.save(login);
        } catch(Exception ex) {
            System.out.println("failed to create account, error=" + ex.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Get all students.
     *
     * @return the ResponseEntity with status 200 (OK) and with body of the list of products
     */
    @GetMapping("/students")
    public List<Login> getAllStudents() {
        return loginService.findAll();
    }

    @GetMapping("/student/{id}")
    public Optional<Login> getStudent(@PathVariable("id") long id) {
        return loginService.findById(id);
    }


}
