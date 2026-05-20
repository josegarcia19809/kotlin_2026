package org.example.p07_pasajeros

import java.io.File

data class Pasajero2(
    var clave: Int,
    var nombre: String,
    var origen: String,
    var destino: String,
    var pasaje: Double
)

var pasajero1 = Pasajero2(0, "", "", "", 0.0)
val nombreArchivoPasajero2 = "pasajeros2.txt"

fun main() {

//    crearArchivoSiNoExiste()
//
//    pedirDatos()
//
//    escribirEnArchivo()

    recuperarDeArchivoPasajero2()
    mostrarDatosPasajero2()

}

fun pedirDatosPasajero2() {

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

    insertarPasajero2(clavex, nombrex, origenx, destinox, pasajex)

}

fun insertarPasajero2(
    clavex: Int,
    nombrex: String,
    origenx: String,
    destinox: String,
    pasajex: Double
) {
    pasajero1.clave = clavex
    pasajero1.nombre = nombrex
    pasajero1.origen = origenx
    pasajero1.destino = destinox
    pasajero1.pasaje = pasajex

}

fun mostrarDatosPasajero2() {

    println("..................................")
    println("Datos del pasajero:")
    println("Clave: ${pasajero1.clave}")
    println("Nombre: ${pasajero1.nombre}")
    println("Origen: ${pasajero1.origen}")
    println("Destino: ${pasajero1.destino}")
    println("Pasaje: ${pasajero1.pasaje}")

}

fun crearArchivoSiNoExistePasajero2() {

    val archivo = File(nombreArchivoPasajero2)

    if (!archivo.exists()) {
        archivo.createNewFile()
        println("Archivo creado")
    } else {
        println("El archivo ya existe")
    }
}

fun escribirEnArchivoPasajero2() {

    val archivo = File(nombreArchivoPasajero2)
    archivo.writeText(
        "${pasajero1.clave}|${pasajero1.nombre}|${pasajero1.origen}|${pasajero1.destino}|${pasajero1.pasaje}\n"
    )
}

fun recuperarDeArchivoPasajero2() {

    val archivo = File(nombreArchivoPasajero2)

    if (!archivo.exists()) {
        println("No se pudo abrir el archivo")
        return
    }

    val lineas = archivo.readLines()
    for (linea in lineas) {
        val campos = linea.split('|')
        if (campos.size == 5) {
            val clavex = campos[0].toInt()
            val nombrex = campos[1]
            val origenx = campos[2]
            val destinox = campos[3]
            val pasajex = campos[4].toDouble()

            insertarPasajero2(clavex, nombrex, origenx, destinox, pasajex)
        }
    }
}