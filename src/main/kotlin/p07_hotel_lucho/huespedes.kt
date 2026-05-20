package org.example.p07_hotel_lucho

import java.io.File

data class Huesped(
    var nombre: String,
    var telefono: String,
    var dias: Int,
    var nacionalidad: String
)

val huesped = Huesped("", "", 0, "")
val nombreArchivoHuesped = "huespedes.txt"

fun insertarDatosHuesped(
    nombrex: String,
    telefonox: String,
    diasx: Int,
    nacionalidadx: String
) {
    huesped.nombre = nombrex
    huesped.telefono = telefonox
    huesped.dias = diasx
    huesped.nacionalidad = nacionalidadx
}

fun mostrarDatosHuesped() {
    println("Datos del huesped")
    println("Nombre: ${huesped.nombre}")
    println("Teléfono: ${huesped.telefono}")
    println("Días de estancia: ${huesped.dias}")
    println("Nacionalidad: ${huesped.nacionalidad}")
}

fun pedirDatosHuesped() {
    println("Datos del huésped")

    print("Dame nombre: ")
    val nombrex = readln()

    print("Dame teléfono: ")
    val telefonox = readln()

    print("Dame días de estancia: ")
    val diasx = readln().toInt()

    print("Dame nacionalidad: ")
    val nacionalidadx = readln()

    insertarDatosHuesped(nombrex, telefonox, diasx, nacionalidadx)
}

fun escribirHuespedEnArchivo() {
    val archivo = File(nombreArchivoHuesped)
    val texto = "${huesped.nombre}|" +
            "${huesped.telefono}|" +
            "${huesped.dias}|" +
            "${huesped.nacionalidad}"
    archivo.writeText(texto)
    println("El archivo $nombreArchivoHuesped se ha escrito correctamente")
}

fun main() {
    pedirDatosHuesped()
    println("-".repeat(100))
    mostrarDatosHuesped()
    escribirHuespedEnArchivo()
}