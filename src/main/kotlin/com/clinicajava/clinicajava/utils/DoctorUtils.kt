package com.clinicajava.clinicajava.utils
import com.clinicajava.clinicajava.domains.entities.Doctor
import com.clinicajava.clinicajava.domains.responses.CreateDoctorResponse

class DoctorUtils {

    //Función de mapping para el modelo de listas que usa el servicio y el que usa el repository de GetAllDoctors
    fun mapDoctorEntityList(doctorEntities:List<Doctor>):List<CreateDoctorResponse>{
        return doctorEntities.map {
            doctorEntity -> CreateDoctorResponse(
                doct_id = doctorEntity.doct_id,
                doct_nombre = doctorEntity.doct_nombre,
                doct_apellido = doctorEntity.doct_apellido,
                doct_consultorio = doctorEntity.doct_consultorio,
                doct_especialidad = doctorEntity.doct_especialidad,
                doct_correo = doctorEntity.doct_correo,
                doct_createdAt = doctorEntity.doct_createdAt,
                doct_updatedAt = doctorEntity.doct_updatedAt
            )
        }
    }

    //Función de mapping para el modelo que usa el servicio y el que usa el repository de GetAllDoctors
    fun mapDoctorEntity(doctorEntity:Doctor):CreateDoctorResponse{
        return CreateDoctorResponse(
            doct_id = doctorEntity.doct_id,
            doct_nombre = doctorEntity.doct_nombre,
            doct_apellido = doctorEntity.doct_apellido,
            doct_consultorio = doctorEntity.doct_consultorio,
            doct_especialidad = doctorEntity.doct_especialidad,
            doct_correo = doctorEntity.doct_correo,
            doct_createdAt = doctorEntity.doct_createdAt,
            doct_updatedAt = doctorEntity.doct_updatedAt
        )
    }
}