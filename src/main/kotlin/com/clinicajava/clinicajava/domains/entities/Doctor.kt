package com.clinicajava.clinicajava.domains.entities
import jakarta.persistence.*
import java.time.Instant
@Entity
@Table(name = "doctores")
open class Doctor (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="doct_id")
    open var doctId: Long = 0,

    @Column(name="doct_nombre")
    open var doctNombre: String,

    @Column(name="doct_apellido")
    open var doctApellido: String,

    @Column(name="doct_especialidad")
    open var doctEspecialidad: String,

    @Column(name="doct_consultorio")
    open var doctConsultorio: Long,

    @Column(name="doct_correo")
    open var doctCorreo: String? = "",

    @Column(name="doct_created_at")
    open var doctCreatedat: Instant = Instant.now(),

    @Column(name="doct_updated_at")
    open var doctUpdatedat: Instant = Instant.now(),

)