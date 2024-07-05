package com.nivesha.tutoring.dal;

import com.nivesha.tutoring.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

    Optional<Login> findById(long id);

    @Query(value = "SELECT password FROM Student WHERE mail = :email", nativeQuery = true)
    Optional<String> findPasswordByEmail(
            @Param("email") String email
    );


    @Modifying
    @Query(value = "UPDATE Student SET mail = :mail WHERE id = :studentId", nativeQuery = true)
    void updateEmail(
            @Param("studentId") long studentId,
            @Param("mail") String mail
    );

    @Modifying
    @Query(value = "UPDATE Student SET password = :pass WHERE id = :studentId", nativeQuery = true)
    void updatePassword(
            @Param("studentId") long studentId,
            @Param("pass") String pass
    );


}
