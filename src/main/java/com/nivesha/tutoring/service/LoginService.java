package com.nivesha.tutoring.service;

import com.nivesha.tutoring.models.Login;
import com.nivesha.tutoring.dal.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public void save(Login login) {
        loginRepository.save(login);
    }

    public boolean verifyPassword(String emailId, String password) {
        if ((loginRepository.findPasswordByEmail(emailId)).toString().equals(password)) {
            return true;
        } else {
            return false;
        }


    }

    public Optional<Login> findById(long id) {
        return loginRepository.findById(id);
    }

    public List<Login> findAll() {
        return loginRepository.findAll();
    }

}
