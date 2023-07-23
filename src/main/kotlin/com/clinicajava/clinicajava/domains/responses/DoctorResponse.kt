package com.clinicajava.clinicajava.domains.responses
import java.time.Instant

//Clase equivalente al modelo de TS, establece cómo se enviará la respuesta
data class DoctorResponse(
    val doctId: Long,
    val doctNombre: String,
    val doctApellido: String,
    val doctEspecialidad: String,
    val doctConsultorio: Long,
    val doctCorreo: String?,
    val doctCreatedat: Instant?,
    val doctUpdatedat: Instant?
)
