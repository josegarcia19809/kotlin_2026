package org.example.p01_fundamentos

fun main() {
    println("🚐 Estacionamiento del centro comercial")

    val pagoHora: Double = 20.0

    print("¿Cuántas horas estuviste estacionado? ")
    val horasEstacionadas: Int = readln().toInt()

    val costoTotal: Double = pagoHora * horasEstacionadas
    if (costoTotal >= 200.0) {
        println("La estadía fue larga")
    } else {
        println("La estadía fue corta")
    }
    println("El costo total fue de $$costoTotal pesos")
}