package org.example.p05_funciones

fun calcularDescuento(
    precio: Double, porcentajeDescuento: Int
) {
    val descuento = precio * (porcentajeDescuento / 100.0)
    println("💸 El descuento es de $descuento pesos")
}

fun main() {
    println("🛒 Dame el precio del producto:")
    val precioProducto = readln().toDouble()

    println("📉 Dame el porcentaje del descuento:")
    val porcentajeDescuento = readln().toInt()

    calcularDescuento(precioProducto, porcentajeDescuento)
}