package com.clinicajava.clinicajava.domains.responses

import java.time.Instant

data class PatientResponse(
    val paciId:Long,
    val paciNombre:String,
    val paciApellido:String,
    val paciIdentif:String,
    var paciTelefono:Long,
    val paciCreatedAt:Instant,
    val paciUpdatedAt:Instant
)