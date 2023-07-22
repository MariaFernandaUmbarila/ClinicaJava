package com.clinicajava.clinicajava.domains.requests

//Clase equivalente al modelo de TS, establece cómo se recibirá la petición
data class CreateDoctorRequest (
    val doct_nombre: String,
    val doct_apellido: String,
    val doct_especialidad: String,
    val doct_consultorio: Long,
    val doct_correo: String?
)