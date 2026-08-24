package org.example.p01_fundamentos

// Programa para calcular el descuento de una compra

fun main() {
    println("Calcular descuentos de compras 🛒")
    val porcentajeDescuento = 0.10

    print("Dame el precio del producto: ")
    val precioProducto = readln().toDouble()

    print("Dame cantidad comprada: ")
    val cantidad = readln().toInt()

    val subtotal = precioProducto * cantidad
    val descuento = subtotal * porcentajeDescuento
    val pagoTotal = subtotal - descuento

    println(String.format("💵Subtotal: $%.2f", subtotal))
    println(String.format("➖Descuento: $%.2f", descuento))
    println(String.format("﹩Pago total: $%.2f", pagoTotal))
}