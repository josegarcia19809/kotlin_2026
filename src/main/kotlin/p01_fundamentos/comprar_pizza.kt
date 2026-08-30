package org.example.p01_fundamentos

fun main() {

    print("💰 ¿Cuánto dinero tienes? ")
    val dinero = readln().toDouble()

    if (dinero < 150) {
        println("😢 No tienes suficiente dinero para comprar la pizza")
    } else {
        println("🍕 ¡Puedes comprar la pizza!")
    }
}

