package org.example.p01_fundamentos

fun main() {
    println("💵Crédito disponible de un cliente")

    print("Dame cantidad máxima de crédito que el cliente puede usar: ")
    val creditoMaximo: Double = readln().toDouble()

    print("Dame cantidad de crédito que el cliente ya ha utilizado: ")
    val creditoUtilizado: Double = readln().toDouble()

    val creditoDisponible: Double = creditoMaximo - creditoUtilizado

    println("El crédito disponible del cliente es $creditoDisponible")
}