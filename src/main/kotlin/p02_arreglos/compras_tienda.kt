package org.example.p02_arreglos

import java.text.DecimalFormat

fun main() {
    println("Costo total de compras en una tienda 🍎")

    // Crear un objeto para formatear números
    val formatoPeso = DecimalFormat("#,##0.00")

    val clientes = 8
    val cantidades = IntArray(clientes)

    for (i in 0 until clientes) {
        print("Cantidad de productos que se llevo el cliente ${i + 1}: ")
        cantidades[i] = readln().toInt()
    }

    // Pedir el precio del producto
    print("Dame el precio del producto: ")
    val precio = readln().toDouble()

    for (i in 0 until clientes) {
        val pagoTotal = cantidades[i] * precio

        println("El cliente ${i + 1} pago $pagoTotal")
    }


}