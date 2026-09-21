package org.example.p05_funciones

fun calcularTotal(precio: Double, cantidad: Int, descuento: Double): Double {
    val subtotal = precio * cantidad
    val totalDescuento = subtotal * (descuento / 100.0)
    return subtotal - totalDescuento
}

fun main() {
    println("Cálculo de compra en supermercado🛒")

    print("💲Introduce el costo del producto: ")
    val costo = readln().toDouble()

    print("🛒Introduce la cantidad comprada: ")
    val cantidad = readln().toInt()

    print("✂️Introduce el porcentaje de descuento: ")
    val descuento = readln().toDouble()

    val totalCompra = calcularTotal(costo, cantidad, descuento)
    println("El total de la compra es $ $totalCompra pesos")
}
