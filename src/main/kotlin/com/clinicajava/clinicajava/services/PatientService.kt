package com.clinicajava.clinicajava.services
import com.clinicajava.clinicajava.domains.entities.Patient
import com.clinicajava.clinicajava.domains.responses.PatientDeleteResponse
import com.clinicajava.clinicajava.domains.responses.PatientResponse
import com.clinicajava.clinicajava.domains.requests.PatientRequest
import com.clinicajava.clinicajava.repositories.PatientRepository
import com.clinicajava.clinicajava.utils.PatientUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class PatientService {

    @Autowired
    private lateinit var patientRepository: PatientRepository

    private var utils:PatientUtils = PatientUtils()

    fun getAllPatients(): MutableList<Patient> {
        return patientRepository.findAll()
    }

    fun getPatientById(id:Long): PatientResponse {
        val paciRepoResponse =  patientRepository.getReferenceById(id)
        return utils.mapPatientEntity(paciRepoResponse)
    }

    fun createPatient(request:PatientRequest): PatientResponse {
        val mappedRequest = utils.mapRequestEnt(request, Instant.now())
        val paciRepoResponse = patientRepository.save(mappedRequest)
        return utils.mapPatientEntity(paciRepoResponse)
    }

    /*fun updatePatientById(request:PatientRequest?, id:Long): PatientResponse {
        val existPatient = patientRepository.getReferenceById(id)

        //Actualiza los valores que vienen en el request
        if (request != null) {
            if(request.paciNombre != null) existPatient.paciNombre = request.paciNombre
            if(request.paciApellido != null) existPatient.paciApellido = request.paciApellido
            if(request.paciTelefono != null) existPatient.paciTelefono = request.paciTelefono
            existPatient.paciUpdatedat = Instant.now()
        }

        patientRepository.save(existPatient)

        return getPatientById(id)

    }*/

    fun deletePatientById(id:Long): PatientDeleteResponse {
        val patientExists:Patient= patientRepository.getReferenceById(id)
        patientRepository.deleteById(id)
        return utils.mapDeleteResponse(patientExists, 1)
    }
}