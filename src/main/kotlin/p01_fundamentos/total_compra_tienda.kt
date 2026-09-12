package org.example.p01_fundamentos

fun main() {
    println("Programa por: José Luis García M")
    println("🛒Total de compra en una tienda")

    print("¿Cuántos productos vas a comprar? ")
    val cantidad = readln().toInt()

    var totalVenta = 0.0

    for (elemento in 1..cantidad) {
        print("Dime precio del producto $elemento: ")
        val precio = readln().toDouble()

        totalVenta = totalVenta + precio
    }
    println("El total de venta es $%.2f".format(totalVenta))
}