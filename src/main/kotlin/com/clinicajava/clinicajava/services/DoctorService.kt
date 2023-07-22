package com.clinicajava.clinicajava.services
import com.clinicajava.clinicajava.domains.requests.CreateDoctorRequest
import com.clinicajava.clinicajava.domains.responses.CreateDoctorResponse
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class DoctorService {

    //Define la forma del objeto a retornar
    fun createDoctor(request:CreateDoctorRequest):CreateDoctorResponse{
        return CreateDoctorResponse(
            doct_id = 1,
            doct_nombre = request.doct_nombre,
            doct_apellido = request.doct_apellido,
            doct_especialidad = request.doct_especialidad,
            doct_consultorio = request.doct_consultorio,
            doct_correo = request.doct_correo,
            doct_createdAt = Instant.now(),
            doct_updatedAt = Instant.now()
        )
    }

    fun getAllDoctors(): List<CreateDoctorResponse>{
        var response:List<CreateDoctorResponse> = listOf(
            CreateDoctorResponse(
                    doct_id = 1,
                    doct_nombre = "request.doct_nombre",
                    doct_apellido = "request.doct_apellido",
                    doct_especialidad = "request.doct_especialidad",
                    doct_consultorio = 502,
                    doct_correo = "request.doct_correo",
                    doct_createdAt = Instant.now(),
                    doct_updatedAt = Instant.now()
            )
        )
        return response
    }
}