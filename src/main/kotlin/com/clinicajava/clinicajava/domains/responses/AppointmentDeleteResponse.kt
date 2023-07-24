package com.clinicajava.clinicajava.domains.responses

data class AppointmentDeleteResponse(
    val rowsDeleted:Int,
    val citaHorario:String,
    val citaDoctId:Long,
    val citaPaciIdentif:String
)