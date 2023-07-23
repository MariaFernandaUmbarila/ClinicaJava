package com.clinicajava.clinicajava.domains.requests

//Clase equivalente al modelo de TS, establece cómo se recibirá la petición
data class DoctorRequest (
    val doctId: Long,
    val doctNombre: String,
    val doctApellido: String,
    val doctEspecialidad: String,
    val doctConsultorio: Long,
    val doctCorreo: String?
)