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

**Nombre de la base de datos**: clinica_java

---

## Pasos para ejecutar el proyecto en máquina local

1. Ejecutar el comando `docker compose up` a la base de datos de PostgreSQL que se encuentra en el archivo `postgresdb.txt`
2. En IntelliJ IDEA ejecutar ClinicaJavaApplication, verificar que ninguna otra aplicación esté ocupando el puerto 8080 usado por el servicio.