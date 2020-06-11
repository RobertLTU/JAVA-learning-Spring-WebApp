package com.robertidr.ExamRealTest.repositories;

import com.robertidr.ExamRealTest.models.Darbuotojas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface DarbuotojasRepository extends JpaRepository<Darbuotojas, Integer> {

    @Query(value = "SELECT COUNT(*) FROM darbuotojai WHERE skyrius = :skyrius", nativeQuery = true)
    int darbuotojuSkyriuje(@Param("skyrius") String skyrius);

}
