package com.clinicajava.clinicajava.repositories
import com.clinicajava.clinicajava.domains.entities.Doctor
import com.clinicajava.clinicajava.domains.requests.CreateDoctorRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Propagation
import org.springframework.transaction.annotation.Transactional
import java.time.Instant

@Repository
interface DoctorRepository:JpaRepository<Doctor, Long> {

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("select * from doctores", nativeQuery= true)
    fun getAllDoctors(): List<Doctor>
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("select * from doctores where doct_id = :id", nativeQuery= true)
    fun getByDoctorId(id:Long): Doctor

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    @Query("insert into doctores(doct_id, doct_nombre, doct_apellido, doct_especialidad, doct_consultorio, doct_correo, doct_created_at, doct_updated_at) " +
            "values(:#{#request.doct_id}, :#{#request.doct_nombre}, :#{#request.doct_apellido}, :#{#request.doct_especialidad}, :#{#request.doct_consultorio}, :#{#request.doct_correo}, :time, :time)",
            nativeQuery= true)
    @Modifying
    fun createDoctor(request:CreateDoctorRequest, time:Instant)

}