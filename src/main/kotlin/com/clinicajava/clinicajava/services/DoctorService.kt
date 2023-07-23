package com.clinicajava.clinicajava.services
import com.clinicajava.clinicajava.domains.entities.Doctor
import com.clinicajava.clinicajava.domains.requests.CreateDoctorRequest
import com.clinicajava.clinicajava.domains.responses.CreateDoctorResponse
import com.clinicajava.clinicajava.repositories.DoctorRepository
import com.clinicajava.clinicajava.utils.DoctorUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class DoctorService {

    @Autowired
    private lateinit var doctorRepository: DoctorRepository
    //Trae  funciones desde los utils
    private var utils:DoctorUtils = DoctorUtils()
    fun getAllDoctors(): List<CreateDoctorResponse> {
        val doctRepoResponse: List<Doctor> = doctorRepository.getAllDoctors()
        return utils.mapDoctorEntityList(doctRepoResponse)
    }

    fun getDoctorById(id:Long):CreateDoctorResponse{
        val doctRepoResponse:Doctor = doctorRepository.getByDoctorId(id)
        return utils.mapDoctorEntity(doctRepoResponse)
    }

    //Define la forma del objeto a retornar
    fun createDoctor(request:CreateDoctorRequest):CreateDoctorResponse{
        doctorRepository.createDoctor(request, Instant.now())
        val isCreatedResponse = doctorRepository.getByDoctorId(request.doct_id)
        return utils.mapDoctorEntity(isCreatedResponse)
    }
}