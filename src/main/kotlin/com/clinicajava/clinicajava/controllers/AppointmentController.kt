package com.clinicajava.clinicajava.controllers
import com.clinicajava.clinicajava.constants.CreateAppointment
import com.clinicajava.clinicajava.constants.DeleteAppointmentById
import com.clinicajava.clinicajava.constants.GetAllAppointments
import com.clinicajava.clinicajava.constants.GetAppointmentById
import com.clinicajava.clinicajava.domains.entities.Appointment
import com.clinicajava.clinicajava.domains.requests.AppointmentRequest
import com.clinicajava.clinicajava.domains.responses.AppointmentDeleteResponse
import com.clinicajava.clinicajava.domains.responses.AppointmentResponse
import com.clinicajava.clinicajava.services.AppointmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class AppointmentController {

    @Autowired
    private lateinit var appointmentService: AppointmentService

    @GetMapping(GetAllAppointments)
    fun getAllAppointments(): MutableList<Appointment> {
        return appointmentService.getAllAppointments()
    }

    @GetMapping(GetAppointmentById)
    fun getAppointmentById(@PathVariable id:Long): AppointmentResponse {
        return appointmentService.getAppointmentById(id)
    }

    @PostMapping(CreateAppointment)
    fun createAppointment(@RequestBody request:AppointmentRequest): AppointmentResponse {
        return appointmentService.createAppointment(request)
    }

    @DeleteMapping(DeleteAppointmentById)
    fun deleteApoointmAppointmentDeleteResponse(@PathVariable id:Long): AppointmentDeleteResponse {
        return appointmentService.deleteAppointment(id)
    }
}