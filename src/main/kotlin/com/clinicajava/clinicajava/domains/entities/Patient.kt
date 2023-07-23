package com.clinicajava.clinicajava.domains.entities
import jakarta.persistence.*
import org.hibernate.annotations.DynamicUpdate
import java.time.Instant

@Entity
@Table(name = "pacientes")
@DynamicUpdate
open class Patient (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="paci_id")
    open var paciId: Long = 0,

    @Column(name="paci_nombre")
    open var paciNombre: String,

    @Column(name="paci_apellido")
    open var paciApellido: String,

    @Column(name="paci_identif")
    open var paciIdentif: String,

    @Column(name="paci_telefono")
    open var paciTelefono: Long,

    @Column(name="paci_created_at")
    open var paciCreatedat: Instant = Instant.now(),

    @Column(name="paci_updated_at")
    open var paciUpdatedat: Instant = Instant.now(),

)