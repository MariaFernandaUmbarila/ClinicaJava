package com.clinicajava.clinicajava.domains.requests

data class AppointmentRequest (
    val citaId:Long,
    val citaHorario:String,
    val citaEspecialidad:String,
    val citaDoctId:Long,
    val citaPaciIdentif:String,
    val citaConsultorio:Long
)