package org.example.p04_when

fun main() {
    println("Encuentro con un animal 🦒")
    print("¿Con qué animal te has encontrado? ")
    val animal = readln()
    var accion = ""

    when (animal) {
        "gato" -> {
            accion = "alimentarlo 🐈"
        }

        "perro" -> {
            accion = "acariciarlo 🐕"
        }

        else -> {
            accion = "googlear cómo lo debes tratar 🔍"
        }
    }
    println("Cuando te encuentres con un(a) $animal debes $accion")
}