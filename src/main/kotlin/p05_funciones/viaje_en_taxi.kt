package org.example.p05_funciones

fun calcularTarifa(distancia: Double, tarifaBase: Double, costoPorKm: Double): Double {
    return tarifaBase + (costoPorKm * distancia)
}

fun mostrarViaje(nombreCliente: String, costo: Double) {
    println("🚕👩🏻‍🦱👨🏻El (la) cliente $nombreCliente pagará $ $costo pesos")
}

fun main() {
    println("Viaje en taxi 🚕")

    print("👨🏻👩🏻‍🦱Dame el nombre del cliente: ")
    val nombreCliente = readln()

    print("💲 Dame la tarifa base: ")
    val tarifaBase = readln().toDouble()

    print("㎞ Dame los kilometros recorridos: ")
    val distancia = readln().toDouble()

    print("💲 Dame el costo por kilometro: ")
    val costoPorKm = readln().toDouble()

    val costoDelViaje = calcularTarifa(distancia, tarifaBase, costoPorKm)

    mostrarViaje(nombreCliente, costoDelViaje)

}