package org.example.p01_fundamentos

fun main() {

    print("🎮 ¿Cuántos puntos tienes? ")
    val puntos = readln().toInt()

    if (puntos > 10) {
        println("🏆 ¡Puedes entrar a la zona especial!")
    } else {
        println("🔒 Necesitas conseguir más puntos")
    }
}

