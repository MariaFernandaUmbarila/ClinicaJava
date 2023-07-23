package com.clinicajava.clinicajava.controllers
import com.clinicajava.clinicajava.constants.CreateDoctor
import com.clinicajava.clinicajava.constants.GetAllDoctors
import com.clinicajava.clinicajava.constants.GetDoctorById
import com.clinicajava.clinicajava.constants.UpdateDoctor
import com.clinicajava.clinicajava.domains.requests.CreateDoctorRequest
import com.clinicajava.clinicajava.domains.responses.CreateDoctorResponse
import com.clinicajava.clinicajava.domains.responses.HealthCheckResponse
import com.clinicajava.clinicajava.services.DoctorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class DoctorController {

    /*Esta etiqueta permite la conexión de DoctorService a través de la variable allí
    descrita. Para esto, el servicio debe contar con la etiqueta @Service */
    @Autowired
    private lateinit var doctorService:DoctorService

    @GetMapping(GetAllDoctors)
    fun getAllDoctors(): List<CreateDoctorResponse>{
        return doctorService.getAllDoctors()
    }

    @GetMapping(GetDoctorById)
    fun getDoctorById( @PathVariable("id") id: Long): CreateDoctorResponse{
        return doctorService.getDoctorById(id)
    }

    /*El parámetro dentro del @PostMapping es el que define la ruta para este endpoint, la etiqueta
    del @ResquestBody define de qué tipo será la petición. Por último, se llama al servicio y se le
    pasa como parámetro el request */
    @PostMapping(CreateDoctor)
    fun createDoctor(@RequestBody request: CreateDoctorRequest):CreateDoctorResponse = doctorService.createDoctor(request)

    @PutMapping(UpdateDoctor)
    fun updateDoctor():ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}