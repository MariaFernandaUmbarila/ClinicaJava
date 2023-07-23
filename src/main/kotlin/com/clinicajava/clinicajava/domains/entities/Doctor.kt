package com.clinicajava.clinicajava.domains.entities
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.*
import java.time.Instant
@Entity
@Table(name = "doctores")
open class Doctor (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="doct_id")
    open var doct_id: Long=0,

    @Column(name="doct_nombre")
    open var doct_nombre: String,

    @Column(name="doct_apellido")
    open var doct_apellido: String,

    @Column(name="doct_especialidad")
    open var doct_especialidad: String,

    @Column(name="doct_consultorio")
    open var doct_consultorio: Long,

    @Column(name="doct_correo")
    open var doct_correo: String? = "",

    @Column(name="doct_created_at")
    open var doct_createdAt: Instant = Instant.now(),

    @Column(name="doct_updated_at")
    open var doct_updatedAt: Instant = Instant.now(),

)