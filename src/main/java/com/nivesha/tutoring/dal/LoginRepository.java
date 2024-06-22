package com.nivesha.tutoring.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login, Long> {
    Optional<Login> findById(long id);

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
