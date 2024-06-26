package com.nivesha.tutoring.service;

import com.nivesha.tutoring.dal.Login;
import com.nivesha.tutoring.dal.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LoginService {

    private final LoginRepository loginRepository;
    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public void save(Login login) {
        loginRepository.save(login);
    }

    public Optional<Login> findById(long id) {
        return loginRepository.findById(id);
    }

    public List<Login> findAll() {
        return loginRepository.findAll();
    }

}
