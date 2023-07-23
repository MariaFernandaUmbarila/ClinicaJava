package com.clinicajava.clinicajava.utils
import com.clinicajava.clinicajava.domains.entities.Doctor
import com.clinicajava.clinicajava.domains.responses.DoctorDeleteResponse
import com.clinicajava.clinicajava.domains.responses.DoctorResponse

class DoctorUtils {

    //Función de mapping para el modelo de listas que usa el servicio y el que usa el repository de GetAllDoctors
    fun mapDoctorEntityList(doctorEntities:List<Doctor>):List<DoctorResponse>{
        return doctorEntities.map {
            doctorEntity -> DoctorResponse(
                doctId = doctorEntity.doct_id,
                doctNombre = doctorEntity.doct_nombre,
                doctApellido = doctorEntity.doct_apellido,
                doctConsultorio = doctorEntity.doct_consultorio,
                doctEspecialidad = doctorEntity.doct_especialidad,
                doctCorreo = doctorEntity.doct_correo,
                doctCreatedat = doctorEntity.doct_createdAt,
                doctUpdatedat = doctorEntity.doct_updatedAt
            )
        }
    }

    //Función de mapping para el modelo que usa el servicio y el que usa el repository de GetAllDoctors
    fun mapDoctorEntity(doctorEntity:Doctor):DoctorResponse{
        return DoctorResponse(
            doctId = doctorEntity.doct_id,
            doctNombre = doctorEntity.doct_nombre,
            doctApellido = doctorEntity.doct_apellido,
            doctConsultorio = doctorEntity.doct_consultorio,
            doctEspecialidad = doctorEntity.doct_especialidad,
            doctCorreo = doctorEntity.doct_correo,
            doctCreatedat = doctorEntity.doct_createdAt,
            doctUpdatedat = doctorEntity.doct_updatedAt
        )
    }

    //Función de mapping para el modelo que usa el servicio y el que retorna el repository para DeteleDoctorById
    fun mapDoctorDelete(doctorEntity:Doctor, rows:Long):DoctorDeleteResponse{
        return DoctorDeleteResponse(
            rowsDeleted = rows,
            doctId = doctorEntity.doct_id,
            doctNombre = doctorEntity.doct_nombre,
            doctApellido = doctorEntity.doct_apellido
        )
    }
}