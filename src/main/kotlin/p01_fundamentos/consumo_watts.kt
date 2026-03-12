package org.example.p01_fundamentos

fun main() {
    println("Consumo de energía 💡⚡️")

    print("¿Cuántos aparatos electrónicos hay? ")
    val cantidadAparatos = readln().toInt()

    var consumoTotal = 0.0

    for (i in 1..cantidadAparatos) {
        print("Consumo del aparato $i en watts: ")
        val consumo = readln().toDouble()

        consumoTotal = consumoTotal + consumo
    }
    println("El total de consumo es %.2f watts".format(consumoTotal))
}