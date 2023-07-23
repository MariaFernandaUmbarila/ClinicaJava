package com.clinicajava.clinicajava.controllers
import com.clinicajava.clinicajava.constants.GetAllAppointments
import com.clinicajava.clinicajava.domains.entities.Appointment
import com.clinicajava.clinicajava.services.AppointmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppointmentController {

    @Autowired
    private lateinit var appointmentService: AppointmentService

    @GetMapping(GetAllAppointments)
    fun getAllAppointments(): MutableList<Appointment> {
        return appointmentService.getAllAppointments()
    }
}