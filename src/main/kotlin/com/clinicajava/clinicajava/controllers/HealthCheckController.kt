package com.clinicajava.clinicajava.controllers
import com.clinicajava.clinicajava.constants.HEALTH_CHECK
import com.clinicajava.clinicajava.constants.CreateDoctor
import com.clinicajava.clinicajava.constants.GetDoctorById
import com.clinicajava.clinicajava.constants.UpdateDoctor
import com.clinicajava.clinicajava.domains.responses.HealthCheckResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    /*Petición de tipo GET, trae el tipo de respuesta desde el domain, devuelve ese mismo
    tipo, más el status code de la petición*/
    @GetMapping(HEALTH_CHECK)
    fun healthCheck():ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)

    @PostMapping(CreateDoctor)
    fun createDoctor():ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)

    @GetMapping(GetDoctorById)
    fun getDoctorById():ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)

    @PutMapping(UpdateDoctor)
    fun updateDoctor():ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}