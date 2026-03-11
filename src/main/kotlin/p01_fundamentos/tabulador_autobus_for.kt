package org.example.p01_fundamentos

fun main() {
    println("Autotransportes del Centro 🚗🚌")

    print("Dime precio del viaje: ")
    val precio = readln().toDouble()

    println("Viajes\tTotal a pagar")
    println(".".repeat(50))
    for (viajes in 1..10) {
        val total = precio * viajes
        println("$viajes\t\t$$total")
    }
}