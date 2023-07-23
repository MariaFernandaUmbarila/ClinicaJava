package com.clinicajava.clinicajava.utils
import com.clinicajava.clinicajava.domains.entities.Patient
import com.clinicajava.clinicajava.domains.requests.PatientRequest
import com.clinicajava.clinicajava.domains.responses.PatientDeleteResponse
import com.clinicajava.clinicajava.domains.responses.PatientResponse
import java.time.Instant

class PatientUtils {

    //Función de mapping desde la entidad hacia la respuesta establecida
    fun mapPatientEntity(patientEntity:Patient):PatientResponse{
        return PatientResponse(
            paciId = patientEntity.paciId,
            paciNombre = patientEntity.paciNombre,
            paciApellido = patientEntity.paciApellido,
            paciIdentif = patientEntity.paciIdentif,
            paciTelefono = patientEntity.paciTelefono,
            paciCreatedAt = patientEntity.paciCreatedat,
            paciUpdatedAt = patientEntity.paciUpdatedat
        )
    }

    //Función de mapping desde el request establecido hacia la entidad
    fun mapRequestEnt(patientRequest: PatientRequest, time:Instant):Patient{
        return Patient(
            paciId = patientRequest.paciId,
            paciNombre = patientRequest.paciNombre,
            paciApellido = patientRequest.paciApellido,
            paciIdentif = patientRequest.paciIdentif,
            paciTelefono = patientRequest.paciTelefono,
            paciCreatedat = time,
            paciUpdatedat = time
        )
    }

    fun mapDeleteResponse(patientEntity: Patient, rows:Long):PatientDeleteResponse{
        return PatientDeleteResponse(
            rowsDeleted = rows,
            paciNombre = patientEntity.paciNombre,
            paciIdentif = patientEntity.paciIdentif,
            paciApellido = patientEntity.paciApellido
        )
    }
}