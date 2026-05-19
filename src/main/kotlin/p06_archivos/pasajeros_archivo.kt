package org.example.p06_archivos

/*
    Creado por Jose Garcia el 08/05/26
    Este programa usa una colección para guardar los datos de varios pasajeros
*/

import java.io.File

data class Pasajero(
    var clave: Int,
    var nombre: String,
    var origen: String,
    var destino: String,
    var pasaje: Double
)

val pasajeros = mutableListOf<Pasajero>()
val nombreArchivo = "pasajeros3.txt"

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

    val nuevo = Pasajero(
        clavex,
        nombrex,
        origenx,
        destinox,
        pasajex
    )

    pasajeros.add(nuevo)
}

fun mostrarDatosPasajero() {

    if (pasajeros.isEmpty()) {
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

    for (pasajero in pasajeros) {

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

    val archivo = File(nombreArchivo)

    if (!archivo.exists()) {
        archivo.createNewFile()
        println("Archivo creado")
    } else {
        println("El archivo ya existe")
    }
}

fun escribirEnArchivoPasajero() {

    val archivo = File(nombreArchivo)

    archivo.printWriter().use { salida ->

        for (pasajero in pasajeros) {

            salida.println(
                "${pasajero.clave}|${pasajero.nombre}|${pasajero.origen}|${pasajero.destino}|${pasajero.pasaje}"
            )
        }
    }
}

fun recuperarDeArchivoPasajero() {

    val archivo = File(nombreArchivo)

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