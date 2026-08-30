package org.example.p01_fundamentos

fun main() {

    print("🎢 ¿Cuántos años tienes? ")
    val edad = readln().toInt()

    if (edad <= 12) {
        println("🎉 ¡Puedes subir a la atracción!")
    } else {
        println("🚫 Eres demasiado grande para esta atracción")
    }
}

