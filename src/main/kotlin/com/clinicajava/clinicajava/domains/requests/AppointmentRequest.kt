package com.clinicajava.clinicajava.domains.requests
import java.time.Instant

data class AppointmentRequest (
    val citaId:Long,
    val citaHorario:String,
    val citaEspecialidad:String,
    val citaDoctId:Long,
    val citaPaciIdentif:String,
    val citaConsultorio:Long,
    val citaCreatedAt:Instant,
    val updatedAt:Instant
)