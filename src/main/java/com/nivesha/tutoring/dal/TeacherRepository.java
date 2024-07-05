

package com.nivesha.tutoring.dal;

import com.nivesha.tutoring.models.Login;
import com.nivesha.tutoring.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Optional<Login> findById(long id);



}
