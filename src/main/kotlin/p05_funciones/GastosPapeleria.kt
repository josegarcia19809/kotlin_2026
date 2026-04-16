package org.example.p05_funciones

fun cobrarVentaArticulo(nombre: String, precio: Double, cantidad: Int) {
    val total = precio * cantidad
    println("🛍️ Producto: $nombre")
    println("💲 Precio unitario: $precio")
    println("🔢 Cantidad: $cantidad")
    println("💰 Total a pagar: $total")
}

fun main() {
    println("✏️ Dame el nombre del artículo:")
    val nombre = readln()

    println("💲 Dame el precio del artículo:")
    val precio = readln().toDouble()

    println("🔢 Dime la cantidad que deseas comprar:")
    val cantidad = readln().toInt()

    cobrarVentaArticulo(nombre, precio, cantidad)
}