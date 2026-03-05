package org.example.p01_fundamentos

fun main() {
    println("Pedido en hamburguesería🍔")

    val precioHamburguesa = 60.0
    print("¿Cuántas hamburguesas compró el cliente? ")
    val cantidad = readln().toInt()

    val totalCompra = precioHamburguesa * cantidad

    println("Total compra: $$totalCompra")
    if (totalCompra <= 300) {
        println("Tu pedido es pequeño")
    } else {
        println("Tu pedido es grande")
    }
}