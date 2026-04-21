package org.example.p05_funciones

fun main() {
    while (true) {
        println()
        println("-".repeat(100))
        println("Precio combo comida 'San Felipe 🍔🥤'")

        print("Dame el precio base del combo: ")
        val precio = readln().toDouble()

        menuCombo()
        val tamanio = readln().toInt()

        calcularPrecioCombo(precio, tamanio)
    }
}

fun calcularPrecioCombo(precioBase: Double, tamanoCombo: Int) {
    var extra = 0.0
    when (tamanoCombo) {
        1 -> {
            extra = 20.0
        }

        2 -> {
            extra = 40.0
        }

        3 -> {
            extra = 60.0
        }

        4 -> {
            extra = 80.0
        }

        else -> {
            println("Error, tamaño incorrecto")
            return
        }
    }
    val precioFinal = precioBase + extra
    println("El precio final del combo es $precioFinal")
}

fun menuCombo() {
    println("Tamaños de combos")
    println("1. 🍔Combo pequeño → ➕ +20 pesos")
    println("2. 🍔Combo mediano → ➕ +40 pesos")
    println("3. 🍔Combo grande → ➕ +60 pesos")
    println("4. 🍔Combo extra grande → ➕ +80 pesos")
    print("😋Elige: ")
}