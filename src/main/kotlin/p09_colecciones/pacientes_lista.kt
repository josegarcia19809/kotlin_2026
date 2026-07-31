package org.example.p09_colecciones

import org.example.p05_funciones.imprimirLineaDivision

//----------------------------------------------------
// Muestra el título del programa.
//----------------------------------------------------
fun mostrarEncabezadoList() {
    println("========================================")
    println(" SISTEMA DE GESTIÓN DE PACIENTES")
    println("========================================")
}

//----------------------------------------------------
// Convierte una lista de solo lectura en una lista
// mutable y agrega nuevos pacientes.
//----------------------------------------------------
fun registrarPacientesList() {

    val pacientes = listOf(
        "Ana",
        "Carlos",
        "María",
        "José"
    )
    val pacientesMutable = pacientes.toMutableList()
    pacientesMutable.add("Luis")
    pacientesMutable.add("Fernando")
    println("\n===== REGISTRO DE PACIENTES =====")
    println(pacientesMutable)
}

//----------------------------------------------------
// Obtiene el último paciente registrado.
//----------------------------------------------------
fun mostrarUltimoPaciente() {

    val pacientes = listOf(
        "Ana",
        "Carlos",
        "María",
        "José"
    )

    println("\n===== ÚLTIMO PACIENTE =====")
    println(pacientes.last())
}

//----------------------------------------------------
// Muestra la lista en orden inverso.
//----------------------------------------------------
fun mostrarPacientesOrdenInverso() {

    val pacientes = listOf(
        "Ana",
        "Carlos",
        "María",
        "José"
    )

    println("\n===== PACIENTES EN ORDEN INVERSO =====")
    println(pacientes.asReversed())
}

//----------------------------------------------------
// Busca un paciente utilizando getOrNull() para
// evitar errores por índices fuera de rango.
//----------------------------------------------------
fun buscarPaciente() {

    val pacientes = listOf(
        "Ana",
        "Carlos",
        "María",
        "José"
    )

    println("\n===== BÚSQUEDA DE PACIENTE =====")
    println("Paciente encontrado: ${pacientes.getOrNull(2)}")
    println("Paciente inexistente: ${pacientes.getOrNull(8)}")
}

//----------------------------------------------------
// Obtiene la mayor edad registrada.
//----------------------------------------------------
fun mostrarMayorEdad() {

    val edades = listOf(
        24,
        31,
        19,
        45,
        28
    )

    println("\n===== MAYOR EDAD =====")
    println(edades.maxOrNull())
}

//----------------------------------------------------
// Relaciona pacientes con consultorios.
//----------------------------------------------------
fun asignarConsultorios() {

    val pacientes = listOf(
        "Ana",
        "Carlos",
        "María",
        "José"
    )

    val consultorios = listOf(
        101,
        102,
        103,
        104
    )

    println("\n===== ASIGNACIÓN DE CONSULTORIOS =====")
    println(pacientes.zip(consultorios))
}

//----------------------------------------------------
// Crea una lista que contiene otras listas.
//----------------------------------------------------
fun agruparListas() {

    val pacientes = listOf(
        "Ana",
        "Carlos"
    )

    val doctores = listOf(
        "Dr. López",
        "Dra. Sánchez"
    )

    val grupos = listOf(
        pacientes,
        doctores
    )

    println("\n===== LISTAS AGRUPADAS =====")
    println(grupos)
}

//----------------------------------------------------
// Combina dos listas utilizando el operador +.
//----------------------------------------------------
fun combinarPacientes() {

    val turnoMatutino = listOf(
        "Ana",
        "Carlos"
    )

    val turnoVespertino = listOf(
        "María",
        "José"
    )

    val todos = turnoMatutino + turnoVespertino

    println("\n===== TODOS LOS PACIENTES =====")
    println(todos)
}

//----------------------------------------------------
// Une dos listas eliminando elementos repetidos.
//----------------------------------------------------
fun combinarEspecialidades() {

    val especialidadesA = listOf(
        "Cardiología",
        "Pediatría",
        "Laboratorio"
    )

    val especialidadesB = listOf(
        "Laboratorio",
        "Traumatología",
        "Pediatría"
    )

    println("\n===== ESPECIALIDADES DISPONIBLES =====")
    println(especialidadesA.union(especialidadesB))
}

//----------------------------------------------------
// Elimina elementos duplicados.
//----------------------------------------------------
fun eliminarDuplicados() {

    val pacientes = listOf(
        "Ana",
        "Carlos",
        "Ana",
        "José",
        "Carlos",
        "Fernanda"
    )

    println("\n===== PACIENTES SIN DUPLICADOS =====")
    println(pacientes.distinct())
}

fun main() {
    mostrarEncabezadoList()
    registrarPacientesList()
    imprimirLineaDivision()

    mostrarUltimoPaciente()
    imprimirLineaDivision()

    mostrarPacientesOrdenInverso()
    imprimirLineaDivision()

    buscarPaciente()
    imprimirLineaDivision()

    mostrarMayorEdad()
    imprimirLineaDivision()

    asignarConsultorios()
    imprimirLineaDivision()

    agruparListas()

    imprimirLineaDivision()
    combinarPacientes()

    imprimirLineaDivision()
    combinarEspecialidades()

    imprimirLineaDivision()
    eliminarDuplicados()

}