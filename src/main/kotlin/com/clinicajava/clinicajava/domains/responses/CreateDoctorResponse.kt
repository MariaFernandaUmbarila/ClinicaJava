package com.clinicajava.clinicajava.domains.responses
import java.time.Instant

//Clase equivalente al modelo de TS, establece cómo se enviará la respuesta
data class CreateDoctorResponse(
    val doct_id: Long,
    val doct_nombre: String,
    val doct_apellido: String,
    val doct_especialidad: String,
    val doct_consultorio: Long,
    val doct_correo: String?,
    val doct_createdAt: Instant?,
    val doct_updatedAt: Instant?
)
