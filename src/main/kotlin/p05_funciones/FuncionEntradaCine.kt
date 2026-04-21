package org.example.p05_funciones

fun main() {
    while (true) {
        println()
        println("-".repeat(100))
        println("Precio de entrada al cine 🍿🎥")

        print("Dame el precio de entrada: ")
        val precioEntrada = readln().toDouble()

        menuTipoFuncion()
        val tipoFuncion = readln().toInt()

        calcularPrecioEntrada(precioEntrada, tipoFuncion)
    }
}

fun menuTipoFuncion() {
    println("1. 🎥Función normal -> Sin cambio en el precio")
    println("2. 🕶️Función 3D -> +40 pesos")
    println("3. 🎞️Sala VIP -> +80 pesos")
    println("4. 🌙Función nocturna -> +30 pesos")
    print("Elige tu opción: ")
}

fun calcularPrecioEntrada(precioBase: Double, tipoFuncion: Int) {
    var cargo = 0.0
    when (tipoFuncion) {
        1 -> {
            cargo = 0.0
        }

        2 -> {
            cargo = 40.0
        }

        3 -> {
            cargo = 80.0
        }

        4 -> {
            cargo = 30.0
        }

        else -> {
            print("❌Error. Opción no válida")
            return
        }
    }
    val precioFinal = precioBase + cargo
    print("🍿El precio final de la entrada es de: $precioFinal")
}