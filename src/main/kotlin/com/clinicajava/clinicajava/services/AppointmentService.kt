package com.clinicajava.clinicajava.services
import com.clinicajava.clinicajava.domains.entities.Appointment
import com.clinicajava.clinicajava.repositories.AppointmentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AppointmentService {

    @Autowired
    private lateinit var appointmentRepository: AppointmentRepository

    fun getAllAppointments(): MutableList<Appointment> {
        return appointmentRepository.findAll()
    }
}