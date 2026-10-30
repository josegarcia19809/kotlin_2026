package p02_arreglos

/*
 * Programa elaborado por José L. García M
 * Fecha: 27 de marzo de 2025
 * Este programa suma el total de ventas de un negocio durante una semana en
 * la tienda ElectroHogar.
 */

fun main() {
    val dias = 7
    val ventas = DoubleArray(dias)
    var total_ventas = 0.0

    // Pedir las ventas de cada día
    println("Dame las ventas de cada día")

    for (i in 0 until dias) {
        print("Día #${i + 1}: ")
        ventas[i] = readln().toDouble()
        total_ventas += ventas[i]
    }

    // Obtener la venta mínima y máxima
    val minimo = ventas.minOrNull()!!
    val maximo = ventas.maxOrNull()!!

    println("Venta mínima: $${"%.2f".format(minimo)}")
    println("Venta máxima: $${"%.2f".format(maximo)}")
    println("Total de ventas: $${"%.2f".format(total_ventas)}")
}