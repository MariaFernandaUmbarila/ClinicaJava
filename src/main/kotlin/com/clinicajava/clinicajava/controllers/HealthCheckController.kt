package com.clinicajava.clinicajava.controllers
import com.clinicajava.clinicajava.constants.HEALTH_CHECK
import com.clinicajava.clinicajava.domains.responses.HealthCheckResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity

class HealthCheckController {

    /*Petición de tipo GET, trae el tipo de respuesta desde el domain, devuelve ese mismo
    tipo, más el status code de la petición*/
    @GetMapping(HEALTH_CHECK)
    fun healthCheck():ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}