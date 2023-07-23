package com.clinicajava.clinicajava.domains.requests

data class PatientRequest(
    val paciId:Long,
    val paciNombre:String,
    val paciApellido:String,
    val paciIdentif:String,
    val paciTelefono:Long
)
