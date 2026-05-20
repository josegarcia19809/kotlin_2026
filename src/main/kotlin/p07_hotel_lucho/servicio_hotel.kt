package org.example.p07_hotel_lucho

import java.io.File

data class ServicioHotel(
    var nombreServicio: String,
    var costo: Double,
    var disponible: String,
    var horario: String
)

val servicio = ServicioHotel("", 0.0, "", "")
val nombreArchivoServicio = "servicios.txt"

fun insertarServicio(
    nombrex: String,
    costox: Double,
    disponiblex: String,
    horariox: String
) {
    servicio.nombreServicio = nombrex
    servicio.costo = costox
    servicio.disponible = disponiblex
    servicio.horario = horariox
}

fun mostrarDatosServicio() {
    println("Datos del servicio 💶")
    println("Nombre del servicio: ${servicio.nombreServicio}")
    println("Costo: ${servicio.costo}")
    println("¿Está disponible? ${servicio.disponible}")
    println("Horario: ${servicio.horario}")
}

fun pedirDatosServicio() {
    println("Datos de un nuevo servicio del Hotel 💶")

    print("Dame nombre: ")
    val nombrex = readln()

    print("Dame costo: ")
    val costox = readln().toDouble()

    print("¿Está disponible (si/no)? ")
    val disponiblex = readln()

    print("Dame horario: ")
    val horariox = readln()

    insertarServicio(nombrex, costox, disponiblex, horariox)
}

fun escribirServicioEnArchivo() {
    val archivo = File(nombreArchivoServicio)
    val texto = "${servicio.nombreServicio}|" +
            "${servicio.costo}|" +
            "${servicio.disponible}|" +
            "${servicio.horario}"
    archivo.writeText(texto)
    println("El archivo $nombreArchivoServicio se ha escrito")
}

fun main() {
    pedirDatosServicio()
    println("-".repeat(100))
    mostrarDatosServicio()
    escribirServicioEnArchivo()
}