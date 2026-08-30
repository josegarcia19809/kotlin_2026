package org.example.p01_fundamentos

fun main() {

    print("🎟️ Ingresa tu número de boleto: ")
    val boleto = readln().toInt()

    if (boleto != 25) {
        println("😢 Tu boleto no es el ganador")
    } else {
        println("🎉 ¡Felicidades! ¡Tu boleto es el ganador!")
    }
}

