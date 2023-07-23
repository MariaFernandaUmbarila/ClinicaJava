package com.clinicajava.clinicajava.repositories
import com.clinicajava.clinicajava.domains.entities.Appointment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AppointmentRepository:JpaRepository<Appointment,Long> {}