package org.example.p09_colecciones

import org.example.p05_funciones.imprimirLineaDivision

fun main() {

    mostrarEncabezadoMap()

    mostrarEspecialidadesMap()
    imprimirLineaDivision()

    registrarPacientesMap()
    imprimirLineaDivision()

    recorrerExpedientes()
    imprimirLineaDivision()

    mostrarConsultorio()
    imprimirLineaDivision()

    mostrarPaciente()
    imprimirLineaDivision()
}

//--------------------------------------------------
// Muestra el encabezado del programa.
//--------------------------------------------------
fun mostrarEncabezadoMap() {

    println("========================================")
    println(" SISTEMA DE EXPEDIENTES MÉDICOS")
    println("========================================")
}

//--------------------------------------------------
// Crea un mapa de solo lectura.
//--------------------------------------------------
fun mostrarEspecialidadesMap() {

    val especialidades = mapOf(
        1 to "Cardiología",
        2 to "Pediatría",
        3 to "Traumatología"
    )

    println("\n===== ESPECIALIDADES =====")
    println(especialidades)
    println("Clase: ${especialidades.javaClass}")
}

//--------------------------------------------------
// Crea un HashMap y agrega un nuevo paciente.
//--------------------------------------------------
fun registrarPacientesMap() {

    val expedientes = hashMapOf(
        "P001" to Paciente("Ana", 24),
        "P002" to Paciente("Carlos", 30)
    )

    expedientes.put(
        "P003",
        Paciente("María", 28)
    )

    println("\n===== EXPEDIENTES =====")
    println(expedientes)
}

//--------------------------------------------------
// Recorre el mapa mostrando llave y valor.
//--------------------------------------------------
fun recorrerExpedientes() {

    val expedientes = hashMapOf(
        "P001" to Paciente("Ana", 24),
        "P002" to Paciente("Carlos", 30),
        "P003" to Paciente("María", 28)
    )

    println("\n===== LISTA DE PACIENTES =====")

    for ((folio, paciente) in expedientes) {

        println("Folio: $folio")
        println("Paciente: $paciente")
        println()
    }
}

//--------------------------------------------------
// Utiliza Pair.
//--------------------------------------------------
fun mostrarConsultorio() {

    val asignacion = Pair(
        101,
        "Dr. López"
    )

    val (consultorio, medico) = asignacion

    println("\n===== CONSULTORIO =====")
    println("Consultorio: $consultorio")
    println("Médico: $medico")
}

//--------------------------------------------------
// Desestructura una clase personalizada.
//--------------------------------------------------
fun mostrarPaciente() {

    val paciente = Paciente(
        "Fernanda",
        35
    )

    val (nombre, edad) = paciente

    println("\n===== DATOS DEL PACIENTE =====")
    println("Nombre: $nombre")
    println("Edad: $edad años")
}

//--------------------------------------------------
// Clase Paciente
//--------------------------------------------------
class Paciente(
    val nombre: String,
    val edad: Int
) {

    operator fun component1() = nombre

    operator fun component2() = edad

    override fun toString(): String {
        return "$nombre ($edad años)"
    }
}