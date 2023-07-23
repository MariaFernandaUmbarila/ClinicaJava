package com.clinicajava.clinicajava.services
import com.clinicajava.clinicajava.domains.entities.Doctor
import com.clinicajava.clinicajava.domains.requests.DoctorRequest
import com.clinicajava.clinicajava.domains.responses.DoctorDeleteResponse
import com.clinicajava.clinicajava.domains.responses.DoctorResponse
import com.clinicajava.clinicajava.repositories.DoctorRepository
import com.clinicajava.clinicajava.utils.DoctorUtils
import org.hibernate.type.descriptor.java.CoercionHelper.toLong
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class DoctorService {

    @Autowired
    private lateinit var doctorRepository: DoctorRepository
    //Trae  funciones desde los utils
    private var utils:DoctorUtils = DoctorUtils()

    //Define la forma del objeto a retornar
    fun getAllDoctors(): List<DoctorResponse> {
        val doctRepoResponse: List<Doctor> = doctorRepository.getAllDoctors()
        return utils.mapDoctorEntityList(doctRepoResponse)
    }

    fun getDoctorById(id:Long):DoctorResponse{
        val doctRepoResponse:Doctor = doctorRepository.getDoctorById(id)
        return utils.mapDoctorEntity(doctRepoResponse)
    }

    fun createDoctor(request:DoctorRequest):DoctorResponse{
        doctorRepository.createDoctor(request, Instant.now())
        try {
            val isCreatedResponse = doctorRepository.getDoctorById(request.doctId)
            return utils.mapDoctorEntity(isCreatedResponse)
        }catch (error:Exception){
            throw error
        }
    }

    fun updateDoctorById(request: DoctorRequest?, id:Long):DoctorResponse{
        doctorRepository.updateDoctorById(request, Instant.now(), id)
        val doctRepoResponse:Doctor = doctorRepository.getDoctorById(id)
        return utils.mapDoctorEntity(doctRepoResponse)
    }

    fun deleteDoctorById(id:Long): DoctorDeleteResponse {
        val doctorExist:Doctor = doctorRepository.getDoctorById(id)
        val doctRepoResponse:Int = doctorRepository.deleteDoctorById(id)

        return if (doctRepoResponse > 0) {
            utils.mapDoctorDelete(doctorExist, toLong(doctRepoResponse))
        }else{
            utils.mapDoctorDelete(doctorExist, 0)
        }
    }
}