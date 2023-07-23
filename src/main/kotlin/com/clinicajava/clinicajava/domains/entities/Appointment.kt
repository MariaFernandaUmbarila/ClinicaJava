package com.clinicajava.clinicajava.domains.entities
import jakarta.persistence.*
import java.time.Instant

@Entity
@Table(name = "citas")
open class Appointment (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cita_id")
    open var citaId: Long = 0,

    @Column(name="cita_horario")
    open var citaHorario: String,

    @Column(name="cita_doct_id")
    open var citaDoctId: Long,

    @Column(name="cita_paci_identif")
    open var citaPaciIdentif: String,

    @Column(name="cita_consultorio")
    open var citaConsultorio: Long,

    @Column(name="cita_created_at")
    open var citaCreatedAt: Instant = Instant.now(),

    @Column(name="cita_updated_at")
    open var citaUpdatedAt: Instant = Instant.now(),
)