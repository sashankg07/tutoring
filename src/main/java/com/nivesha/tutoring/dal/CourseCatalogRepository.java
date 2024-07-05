package com.nivesha.tutoring.dal;

import com.nivesha.tutoring.models.Course;
import com.nivesha.tutoring.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseCatalogRepository extends JpaRepository<Course, Long> {
    Optional<Login> findById(long id);


}
