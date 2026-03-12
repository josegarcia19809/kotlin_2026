package org.example.p01_fundamentos

fun main() {
    println("Reglas📏")
    print("Dame el precio de las reglas: ")
    val precio = readln().toDouble()
    println()

    println("Cantidad\tPrecio")
    println("_".repeat(20))
    for (cantidadReglas in 20 downTo 10) {
        val total = precio * cantidadReglas
        println("$cantidadReglas\t\t\t$$total")
    }
}