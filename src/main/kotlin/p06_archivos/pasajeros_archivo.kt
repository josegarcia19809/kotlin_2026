package org.example.p06_archivos

/*
    Creado por Jose Garcia el 08/05/26
    Este programa usa una colección para guardar los datos de varios pasajeros
*/

import java.io.File

data class PasajeroPrueba(
    var clave: Int,
    var nombre: String,
    var origen: String,
    var destino: String,
    var pasaje: Double
)

val pasajerosPrueba = mutableListOf<PasajeroPrueba>()
val nombreArchivoPasajerosPrueba = "pasajeros3.txt"

fun main() {

    crearArchivoPasajeroSiNoExiste()
    recuperarDeArchivoPasajero()
    mostrarDatosPasajero()

    var opcion: Int

    do {
        menuPasajeros()
        opcion = readln().toInt()

        when (opcion) {
            1 -> {
                pedirDatosPasajero()
                escribirEnArchivoPasajero()
            }

            2 -> mostrarDatosPasajero()

            3 -> println("Saliendo...")

            else -> println("Opción no válida")
        }

    } while (opcion != 3)
}

fun menuPasajeros() {
    println()
    println("-------------------------------------------------------------------")
    println("SISTEMA DE PASAJEROS")
    println("1.- ALTA DE PASAJEROS")
    println("2.- REPORTE GENERAL")
    println("3.- SALIR")
    print("Elige: ")
}

fun pedirDatosPasajero() {

    println("--------------NUEVO PASAJERO----------------")
    println("Escribe los datos del pasajero")

    print("Dame la clave: ")
    val clavex = readln().toInt()

    print("Dame el nombre: ")
    val nombrex = readln()

    print("Dame origen: ")
    val origenx = readln()

    print("Dame destino: ")
    val destinox = readln()

    print("Dame precio del pasaje: ")
    val pasajex = readln().toDouble()

    insertarPasajero(clavex, nombrex, origenx, destinox, pasajex)
}

fun insertarPasajero(
    clavex: Int,
    nombrex: String,
    origenx: String,
    destinox: String,
    pasajex: Double
) {

    val nuevo = PasajeroPrueba(
        clavex,
        nombrex,
        origenx,
        destinox,
        pasajex
    )

    pasajerosPrueba.add(nuevo)
}

fun mostrarDatosPasajero() {

    if (pasajerosPrueba.isEmpty()) {
        println("No hay pasajeros registrados")
        return
    }

    println()

    println(
        "%-8s %-25s %-25s %-25s %-10s".format(
            "CLAVE",
            "NOMBRE",
            "ORIGEN",
            "DESTINO",
            "PASAJE"
        )
    )

    for (pasajero in pasajerosPrueba) {

        println(
            "%-8d %-25s %-25s %-25s %-10.2f".format(
                pasajero.clave,
                pasajero.nombre,
                pasajero.origen,
                pasajero.destino,
                pasajero.pasaje
            )
        )
    }
}

fun crearArchivoPasajeroSiNoExiste() {

    val archivo = File(nombreArchivoPasajerosPrueba)

    if (!archivo.exists()) {
        archivo.createNewFile()
        println("Archivo creado")
    } else {
        println("El archivo ya existe")
    }
}

fun escribirEnArchivoPasajero() {

    val archivo = File(nombreArchivoPasajerosPrueba)

    archivo.printWriter().use { salida ->

        for (pasajero in pasajerosPrueba) {

            salida.println(
                "${pasajero.clave}|${pasajero.nombre}|${pasajero.origen}|${pasajero.destino}|${pasajero.pasaje}"
            )
        }
    }
}

fun recuperarDeArchivoPasajero() {

    val archivo = File(nombreArchivoPasajerosPrueba)

    archivo.forEachLine { linea ->

        val campos = linea.split("|")

        if (campos.size == 5) {

            val clavex = campos[0].toInt()
            val nombrex = campos[1]
            val origenx = campos[2]
            val destinox = campos[3]
            val pasajex = campos[4].toDouble()

            insertarPasajero(
                clavex,
                nombrex,
                origenx,
                destinox,
                pasajex
            )
        }
    }
}