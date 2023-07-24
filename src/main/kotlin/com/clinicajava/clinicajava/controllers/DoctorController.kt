package com.clinicajava.clinicajava.controllers
import com.clinicajava.clinicajava.constants.*
import com.clinicajava.clinicajava.domains.requests.DoctorRequest
import com.clinicajava.clinicajava.domains.responses.DoctorDeleteResponse
import com.clinicajava.clinicajava.domains.responses.DoctorResponse
import com.clinicajava.clinicajava.services.DoctorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class DoctorController {

    /*Esta etiqueta permite la conexión de DoctorService a través de la variable allí
    descrita. Para esto, el servicio debe contar con la etiqueta @Service */
    @Autowired
    private lateinit var doctorService:DoctorService

    @GetMapping(GetAllDoctors)
    fun getAllDoctors(): List<DoctorResponse>{
        return doctorService.getAllDoctors()
    }

    @GetMapping(GetDoctorById)
    fun getDoctorById(@PathVariable("id") id: Long): DoctorResponse {
        return doctorService.getDoctorById(id)
    }

    /*El parámetro dentro del @PostMapping es el que define la ruta para este endpoint, la etiqueta
    del @ResquestBody define de qué tipo será la petición. Por último, se llama al servicio y se le
    pasa como parámetro el request */
    @PostMapping(CreateDoctor)
    fun createDoctor(@RequestBody request: DoctorRequest): DoctorResponse = doctorService.createDoctor(request)

    @PutMapping(UpdateDoctor)
    fun updateDoctorById(@RequestBody request: DoctorRequest, @PathVariable("id") id: Long): DoctorResponse {
        return doctorService.updateDoctorById(request, id)
    }

    @DeleteMapping(DeleteDoctorById)
    fun deleteDoctorById(@PathVariable("id") id: Long): DoctorDeleteResponse {
        return doctorService.deleteDoctorById(id)
    }

}