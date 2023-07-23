package com.clinicajava.clinicajava.repositories
import com.clinicajava.clinicajava.domains.entities.Patient
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PatientRepository:JpaRepository<Patient, Long> {}