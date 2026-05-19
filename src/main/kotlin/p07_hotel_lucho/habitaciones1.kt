package org.example.p07_hotel_lucho

import java.io.File

data class Habitacion(
    var numero: Int,
    var tipo: String,
    var precioNoche: Double,
    var disponible: String
)

var habitacion1 = Habitacion(0, "", 0.0, "")
val nombreArchivo = "habitaciones.txt"

fun insertar(
    numerox: Int, tipox: String,
    precioNochex: Double, disponiblex: String
) {
    habitacion1.numero = numerox
    habitacion1.tipo = tipox
    habitacion1.precioNoche = precioNochex
    habitacion1.disponible = disponiblex
}

fun pedirDatos() {
    println("Dame los datos de la habitación")

    print("Dame el número: ")
    val numerox = readln().toInt()

    print("Dame el tipo: ")
    val tipox = readln()

    print("Dame el precio por noche: ")
    val precioNochex = readln().toDouble()

    print("Dime si está disponible (si/no): ")
    val disponiblex = readln()

    insertar(numerox, tipox, precioNochex, disponiblex)
}

fun mostrarDatosHabitacion() {
    println("Datos de la habitación")
    println("Número: ${habitacion1.numero}")
    println("Tipo: ${habitacion1.tipo}")
    println("Precio por noche: ${habitacion1.precioNoche}")
    println("Disponible?: ${habitacion1.disponible}")
}

fun escribirEnArchivoHabitacion() {
    val archivo = File(nombreArchivo)
    val texto = "${habitacion1.numero}|${habitacion1.tipo}|" +
            "${habitacion1.precioNoche}|${habitacion1.disponible}"
    archivo.writeText(texto)
    println("El archivo $nombreArchivo se ha escrito correctamente")
}

fun main() {
    pedirDatos()
    println("-".repeat(100))
    mostrarDatosHabitacion()
    escribirEnArchivoHabitacion()
}
