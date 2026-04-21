package org.example.p05_funciones

fun main() {
    println("Descuento con condición por tipo de cliente 🛒💲")

    print("¿Cuánto pagó el cliente? ")
    val pago = readln().toDouble()

    print("Tipo de cliente (VIP, NORMAL): ")
    val tipo = readln().uppercase()

    calcularPrecioFinal(pago, tipo)
}

fun calcularPrecioFinal(precio: Double, tipoCliente: String) {
    var porcentaje = 0

    if (tipoCliente == "VIP") {
        porcentaje = 30
    } else {
        porcentaje = 10
    }

    val descuento = precio * (porcentaje / 100.0)
    val precioFinal = precio - descuento
    println("El precio final para cliente $tipoCliente es de $precioFinal")
}
