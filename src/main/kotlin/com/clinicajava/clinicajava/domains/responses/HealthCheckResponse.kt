package com.clinicajava.clinicajava.domains.responses
import org.springframework.http.HttpStatus
data class HealthCheckResponse(
    //Nombre de la respuesta en formato JSON
    val status:String = HttpStatus.OK.name
)