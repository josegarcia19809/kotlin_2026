package org.example.p11_listas

fun main() {
    println("Compras en el supermercado🥑🥔🐔")

    val precios = mutableListOf(35.00, 45.00, 280.00, 180.00, 60.00, 150.00, 350.00)

    var totalCompra = 0.0

    for (i in 0..<precios.size) {
        totalCompra += precios[i]
    }

    println("Total compra: $totalCompra")

    var descuento = 0.0
    if (totalCompra > 1000) {
        descuento = totalCompra * 0.10
    }
    println("Descuento: $descuento")

    val totalAPagar = totalCompra - descuento
    println("﹩Total a pagar: $totalAPagar")
}