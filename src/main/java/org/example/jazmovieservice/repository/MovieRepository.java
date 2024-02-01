package org.example.jazmovieservice.repository;

import jakarta.transaction.Transactional;
import org.example.jazmovieservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Modifying
    @Transactional
    @Query("UPDATE Movie m SET m.isAvailable = :isAvailable WHERE m.id = :id")
    void setAvailability(@Param("id") Long id, @Param("isAvailable") boolean isAvailable);
}
