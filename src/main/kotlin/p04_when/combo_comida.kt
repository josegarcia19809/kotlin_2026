package org.example.p04_when

fun main() {
    println("🍔Combo de comida😋")
    val alimentoBase = "Hamburguesa"

    print("Dame el ingrediente extra (queso, tocino, vegetales): ")
    val ingredienteExtra = readln()

    var hamburguesaResultante = ""

    when (ingredienteExtra) {
        "queso" -> {
            hamburguesaResultante = "hamburguesa con queso 🍔🧀"
        }

        "tocino" -> {
            hamburguesaResultante = "hamburguesa BBQ 🍔🥓"
        }

        "vegetales" -> {
            hamburguesaResultante = "hamburguesa saludable 🍔🥬"
        }

        else -> {
            hamburguesaResultante = "hamburguesa X 🍔❌"
        }
    }
    println("Tu combo es $alimentoBase y $ingredienteExtra. Resultado: $hamburguesaResultante")
}