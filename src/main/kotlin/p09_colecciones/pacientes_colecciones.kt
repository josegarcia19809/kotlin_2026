package org.example.p09_colecciones

import org.example.p05_funciones.imprimirLineaDivision

fun mostrarEncabezado() {
    println("======================================")
    println(" SISTEMA DE GESTIÓN DE PACIENTES")
    println("======================================")
}


fun listaPacientes() {
    val pacientes = listOf(
        "Ana López",
        "Carlos Ruiz",
        "María Torres",
        "José Pérez"
    )
    println("\n===== PACIENTES DEL DÍA =====")
    println("Clase: ${pacientes.javaClass}")
    println(pacientes)

    println("\n===== ORDEN INVERSO =====")
    println(pacientes.reversed())
}

fun listaEspera() {
    val listaEnEspera = emptyList<String>()
    println("\n===== LISTA DE ESPERA =====")

    if (!listaEnEspera.isEmpty()) {
        println("Primer paciente: ${listaEnEspera[0]}")
    } else {
        println("No existen pacientes en lista de espera.")
    }
}

fun registrarPacientes() {
    val nuevosPacientes = listOfNotNull(
        "Fernanda",
        null,
        "Luis",
        null,
        "Miguel"
    )
    println("\n===== PACIENTES REGISTRADOS =====")
    println(nuevosPacientes)
}

fun administrarConsultorios() {

    val consultorios = mutableListOf(
        101,
        102,
        103
    )

    println("\n===== CONSULTORIOS =====")
    println("Lista original:")
    println(consultorios)

    println("\nConsultorio en la posición 2:")
    println(consultorios[2])

    consultorios[1] = 120

    println("\nLista actualizada:")
    println(consultorios)
}

fun mostrarEspecialidades() {
    val especialidades = arrayOf(
        "Cardiología",
        "Pediatría",
        "Traumatología",
        "Laboratorio"
    )

    val listaEspecialidades = especialidades.toList()
    println("\n===== ESPECIALIDADES =====")
    println(listaEspecialidades)
}

fun mostrarPrioridades() {

    val prioridades = intArrayOf(
        1,
        2,
        3,
        2,
        1
    )

    println("\n===== PRIORIDADES =====")
    println(prioridades.toList())
}

fun main() {
    mostrarEncabezado()
    listaPacientes()
    imprimirLineaDivision()
    listaEspera()
    imprimirLineaDivision()
    registrarPacientes()
    imprimirLineaDivision()
    administrarConsultorios()
    imprimirLineaDivision()
    mostrarEspecialidades()
    imprimirLineaDivision()
    mostrarPrioridades()
}