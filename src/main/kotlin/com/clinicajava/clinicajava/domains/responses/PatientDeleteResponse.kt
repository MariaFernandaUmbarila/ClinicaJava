package com.clinicajava.clinicajava.domains.responses

data class PatientDeleteResponse (
    val rowsDeleted:Long,
    val paciNombre:String,
    val paciApellido:String,
    val paciIdentif:String,
)