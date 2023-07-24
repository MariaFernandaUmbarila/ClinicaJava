package com.clinicajava.clinicajava.services
import com.clinicajava.clinicajava.domains.entities.Appointment
import com.clinicajava.clinicajava.domains.requests.AppointmentRequest
import com.clinicajava.clinicajava.domains.responses.AppointmentDeleteResponse
import com.clinicajava.clinicajava.domains.responses.AppointmentResponse
import com.clinicajava.clinicajava.repositories.AppointmentRepository
import com.clinicajava.clinicajava.utils.AppointmentUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class AppointmentService {

    @Autowired
    private lateinit var appointmentRepository: AppointmentRepository

    private var utils:AppointmentUtils = AppointmentUtils()

    fun getAllAppointments(): MutableList<Appointment> {
        return appointmentRepository.findAll()
    }

    fun getAppointmentById(id:Long): AppointmentResponse {
        val citaRepoResponse = appointmentRepository.getReferenceById(id)
        return utils.mapAppointmentEntity(citaRepoResponse)
    }

    fun createAppointment(request:AppointmentRequest): AppointmentResponse {
        val mappedRequest = utils.mapEntityRequest(request, Instant.now())
        val citaRepoRespose = appointmentRepository.save(mappedRequest)
        return utils.mapAppointmentEntity(citaRepoRespose)
    }

    fun deleteAppointment(id:Long): AppointmentDeleteResponse {
        val citaExists:Appointment = appointmentRepository.getReferenceById(id)
        appointmentRepository.deleteById(id)
        return utils.mapDeleteResponse(citaExists, 1)
    }
}