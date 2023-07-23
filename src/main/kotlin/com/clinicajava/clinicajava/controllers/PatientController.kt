package com.clinicajava.clinicajava.controllers
import com.clinicajava.clinicajava.constants.*
import com.clinicajava.clinicajava.domains.entities.Patient
import com.clinicajava.clinicajava.domains.requests.PatientRequest
import com.clinicajava.clinicajava.domains.responses.PatientDeleteResponse
import com.clinicajava.clinicajava.domains.responses.PatientResponse
import com.clinicajava.clinicajava.services.PatientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class PatientController {

    @Autowired
    private lateinit var patientService: PatientService

    @GetMapping(GetAllPatients)
    fun getAllPatients():MutableList<Patient> {
        return patientService.getAllPatients()
    }

    @GetMapping(GetPatientById)
    fun getPatientById(@PathVariable("id") id: Long): PatientResponse {
        return patientService.getPatientById(id)
    }

    @PostMapping(CreatePatient)
    fun createPatient(@RequestBody request: PatientRequest): PatientResponse = patientService.createPatient(request)

    @PutMapping(UpdatePatient)
    fun updateDoctorById(@RequestBody request: PatientRequest?, @PathVariable("id") id: Long): PatientResponse {
        return patientService.updatePatientById(request, id)
    }

    @DeleteMapping(DeletePatientById)
    fun deleteDoctorById(@PathVariable("id") id: Long): PatientDeleteResponse {
        return patientService.deletePatientById(id)
    }
}