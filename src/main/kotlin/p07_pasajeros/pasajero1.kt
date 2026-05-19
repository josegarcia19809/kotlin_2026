package org.example.p07_pasajeros

data class Pasajero(
    var clave: Int,
    var nombre: String,
    var origen: String,
    var destino: String,
    var pasaje: Double
)

var p1 = Pasajero(0, "", "", "", 0.0)

fun main() {
    pedirDatos()
    mostrarDatosPasajero()
}

fun pedirDatos() {
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

    insertar(clavex, nombrex, origenx, destinox, pasajex)
}

fun insertar(
    clavex: Int,
    nombrex: String,
    origenx: String,
    destinox: String,
    pasajex: Double
) {
    p1.clave = clavex
    p1.nombre = nombrex
    p1.origen = origenx
    p1.destino = destinox
    p1.pasaje = pasajex
}

fun mostrarDatosPasajero() {
    println("..................................")
    println("Datos del pasajero:")
    println("Clave: ${p1.clave}")
    println("Nombre: ${p1.nombre}")
    println("Origen: ${p1.origen}")
    println("Destino: ${p1.destino}")
    println("Pasaje: ${p1.pasaje}")
}