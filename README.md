# Actividad unidad 15 - Todos a la U - Backend Intermedio

## Estado: en progreso

*María Fernanda Umbarila Suárez - 2023*

El presente proyecto está hecho en Kotlin y corresponde al desarrollo de la actividad descrita para el módulo. Se usó PostgreSQL como motor de base de datos. Adicionalmente se cambiaron los nombres de algunas variables y la implementación de algunos métodos, esto para mejorar la comprensión de todos los procesos realizados.

**Versiones**

+ Java: 17
+ SpringBoot: 3.1.2
+ PostgreSQL: última versión traída desde Docker
+ Gradle: 8.2.1
+ Colección de Postman: versión 2.1

**Nombre de la base de datos**: postgres

---

## Pasos para ejecutar el proyecto en máquina local

1. En IntelliJ IDEA ejecutar ClinicaJavaApplication, verificar que ninguna otra aplicación esté ocupando el puerto 8080 usado por el servicio. AL ejecutar el proyecto, se ejecutan las migraciones presentes en el archivo `src/main/resources/db/migrations/V1__init.sql` y se inicializa la base de datos de PostgreSQL con los parámetros dados en el archivo `compose.yml`.
2. Para probar los endpoints en Postman importar la colección del archivo `postman_collection.json`.

---

# Tareas y mejoras realizadas

- [ ] **Terminar el crud de doctoresm, citas y pacientes**. Se finalizó con el CRUD completo de citas y pacientes, como se puede comprobar al probar los endpoints en Postman y al mirar el archivo `src/main/kotlin/com/clinicajava/clinicajava/constants/Routes.kt`. Los endpoints hacen conexión a base de datos desde el repositorio, pasando por el service y luego a los controladores.

# Mejoras pendientes

- [ ] Validar respuestas vacías en cada componente.