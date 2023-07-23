package com.clinicajava.clinicajava.constants

/*Se definen las rutas a usar para cada componente y cada enpoint.
* Estas constantes son importadas y usadas desde los controladores*/

const val HEALTH_CHECK = "/health-check"
const val ApiV1 = "/api/v1"

//Rutas para doctores
const val Doctor = "$ApiV1/doctores"
const val GetAllDoctors = "$Doctor/list_all"
const val CreateDoctor = "$Doctor/create"
const val GetDoctorById = "$Doctor/{id}"
const val DeleteDoctorById = "$Doctor/delete/{id}"
const val UpdateDoctor = "$Doctor/{id}"

//Rutas para pacientes
const val Patient = "$ApiV1/pacientes"
const val GetAllPatients = "$Patient/list_all"
const val CreatePatient = "$Patient/create"
const val GetPatientById = "$Patient/{id}"
const val DeletePatientById = "$Patient/delete/{id}"
const val UpdatePatient = "$Patient/{id}"