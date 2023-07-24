package com.clinicajava.clinicajava.utils
import com.clinicajava.clinicajava.domains.entities.Appointment
import com.clinicajava.clinicajava.domains.responses.AppointmentDeleteResponse
import com.clinicajava.clinicajava.domains.responses.AppointmentResponse
import com.clinicajava.clinicajava.domains.requests.AppointmentRequest
import java.time.Instant

class AppointmentUtils {

    //Función de mapping desde la entidad hacia el objeto de respuesta
    fun mapAppointmentEntity(appointmentEntity:Appointment): AppointmentResponse {
        return AppointmentResponse(
            citaPaciIdentif = appointmentEntity.citaPaciIdentif,
            citaHorario = appointmentEntity.citaHorario,
            citaConsultorio = appointmentEntity.citaConsultorio,
            citaEspecialidad = appointmentEntity.citaEspecialidad,
            citaDoctId = appointmentEntity.citaDoctId
        )
    }

    //Función de mapping desde el objeto del request hacia la entidad
    fun mapEntityRequest(appointmentRequest: AppointmentRequest, time:Instant):Appointment{
        return Appointment(
            citaId = appointmentRequest.citaId,
            citaHorario = appointmentRequest.citaHorario,
            citaEspecialidad = appointmentRequest.citaEspecialidad,
            citaConsultorio = appointmentRequest.citaConsultorio,
            citaPaciIdentif = appointmentRequest.citaPaciIdentif,
            citaDoctId = appointmentRequest.citaDoctId,
            citaCreatedAt = time,
            citaUpdatedAt = time
        )
    }

    //Función de mapping para eliminar cita
    fun mapDeleteResponse(appointmentEntity:Appointment, rows:Int): AppointmentDeleteResponse {
        return AppointmentDeleteResponse(
            rowsDeleted = rows,
            citaPaciIdentif = appointmentEntity.citaPaciIdentif,
            citaHorario = appointmentEntity.citaHorario,
            citaDoctId = appointmentEntity.citaDoctId
        )
    }
}