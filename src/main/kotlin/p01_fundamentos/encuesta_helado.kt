package org.example.p01_fundamentos

fun main() {
    println("Encuesta sobre helados🍧🍋‍🟩")


    var vecesSi = 0
    var respuesta: Int
    for (contador in 1..3) {
        print("¿Te gusta el helado de limón? (1: S o 2: N): ")
        respuesta = readln().toInt()

        if (respuesta == 1) {
            vecesSi++
        }
    }

    println("$vecesSi personas eligieron helado de limón")
}