package org.example.p01_fundamentos

fun main() {
    println("Cuadernos📒📕")

    print("Dime el precio de un cuaderno: ")
    val precio = readln().toDouble()
    println()

    println("Cantidad\tPrecio")
    println(".".repeat(40))
    for (cantidadCuadernos in 1..12) {
        val total = precio * cantidadCuadernos
        println("$cantidadCuadernos\t\t\t$$total")
    }
}