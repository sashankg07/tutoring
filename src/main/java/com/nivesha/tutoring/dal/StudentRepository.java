package com.nivesha.tutoring.dal;

import com.nivesha.tutoring.models.Login;
import com.nivesha.tutoring.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Login> findById(long id);



}
