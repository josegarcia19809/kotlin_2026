package org.example.p01_fundamentos

fun main() {
    println("Renta de taxis🚕")

    print("Dime costo del viaje: ")
    val precio = readln().toDouble()

    println("Viajes\tTotal a pagar")
    println(".".repeat(40))

    for (viajes in 2..20 step 2) {
        val total = precio * viajes
        println("$viajes\t\t$$total")
    }
}