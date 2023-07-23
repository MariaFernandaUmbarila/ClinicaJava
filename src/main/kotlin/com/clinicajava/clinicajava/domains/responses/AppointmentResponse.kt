package com.clinicajava.clinicajava.domains.responses

data class AppointmentResponse(
    val citaHorario:String,
    val citaEspecialidad:String,
    val citaDoctId:Long,
    val citaPaciIdentif:String,
    val citaConsultorio:Long
)
