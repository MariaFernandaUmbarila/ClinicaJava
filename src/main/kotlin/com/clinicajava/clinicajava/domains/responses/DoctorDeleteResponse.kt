package com.clinicajava.clinicajava.domains.responses

data class DoctorDeleteResponse(
    val rowsDeleted:Long,
    val doctId:Long,
    val doctNombre:String,
    val doctApellido:String,
)
