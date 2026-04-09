package org.example.p04_when

fun main() {
    println("Mezcla de bebidas ☕️")
    val bebidaBase = "café"
    print("Dime con qué lo quieres combinar(leche, hielo, chocolate): ")
    val bebida = readln()
    var bebidaResultante = ""
    when (bebida) {
        "leche" -> {
            bebidaResultante = "latte"
        }

        "hielo" -> {
            bebidaResultante = "café frío"
        }

        "chocolate" -> {
            bebidaResultante = "moka"
        }

        else -> {
            bebidaResultante = "bebida rara"
        }
    }
    println("Al mezclar $bebidaBase con $bebida se obtiene $bebidaResultante")
}