package com.clinicajava.clinicajava.repositories
import com.clinicajava.clinicajava.domains.entities.Doctor
import com.clinicajava.clinicajava.domains.requests.DoctorRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.time.Instant

@Repository
@Transactional
interface DoctorRepository:JpaRepository<Doctor, Long> {


    @Query("SELECT * FROM doctores", nativeQuery=true)
    fun getAllDoctors(): List<Doctor>

    @Query("SELECT * FROM doctores WHERE doct_id = :id", nativeQuery=true)
    fun getDoctorById(id:Long): Doctor

    @Modifying
    @Query("INSERT INTO doctores(doct_id, doct_nombre, doct_apellido, doct_especialidad, doct_consultorio, doct_correo, doct_created_at, doct_updated_at) " +
            "VALUES(:#{#request.doctId}, :#{#request.doctNombre}, :#{#request.doctApellido}, :#{#request.doctEspecialidad}, :#{#request.doctConsultorio}, :#{#request.doctCorreo}, :time, :time)",
            nativeQuery=true)
    fun createDoctor(request:DoctorRequest, time:Instant)

    @Modifying
    @Query("UPDATE doctores d SET doct_nombre = CASE WHEN :#{#request.doctNombre != null} THEN :#{#request.doctNombre} ELSE d.doct_nombre END, " +
           "doct_apellido = CASE WHEN :#{#request.doctApellido != null} THEN :#{#request.doctApellido} ELSE d.doct_apellido END," +
           "doct_consultorio = CASE WHEN :#{#request.doctConsultorio != null} THEN :#{#request.doctConsultorio} ELSE d.doct_consultorio END," +
           "doct_correo = CASE WHEN :#{#request.doctCorreo != null} THEN :#{#request.doctCorreo} ELSE d.doct_correo END," +
           "doct_especialidad = CASE WHEN :#{#request.doctEspecialidad != null} THEN :#{#request.doctEspecialidad} ELSE d.doct_nombre END," +
           "doct_updated_at = :time WHERE d.doct_id = :id",
            nativeQuery=true)
    fun updateDoctorById(request:DoctorRequest?, time:Instant, id:Long)

    @Modifying
    @Query("DELETE FROM doctores WHERE doct_id = :id", nativeQuery=true)
    fun deleteDoctorById(id:Long):Int
}