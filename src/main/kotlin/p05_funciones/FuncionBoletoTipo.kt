package org.example.p05_funciones

fun main() {
    while (true) {
        println()
        println(".".repeat(100))
        println("Precio de boleto 🎟️🚍")

        print("Dame el precio del boleto: ")
        val precio = readln().toDouble()

        menuServicio()
        val servicio = readln().toInt()

        calcularPrecioFinal(precio, servicio)
    }
}

fun menuServicio() {
    println("1.- Servicio básico 😋 ->  Sin cambios en el precio")
    println("2.- Servicio cómodo ➕ ->  +50 pesos")
    println("3.- Servicio ejecutivo 🧳 ->  +100 pesos")
    println("4.- Servicio VIP 🌟 ->  +150 pesos")
    print("Elige: ")
}

fun calcularPrecioFinal(precioBase: Double, tipoServicio: Int) {
    var ajuste = 0.0
    when (tipoServicio) {
        1 -> {
            ajuste = 0.0
        }

        2 -> {
            ajuste = 50.0
        }

        3 -> {
            ajuste = 100.0
        }

        4 -> {
            ajuste = 150.0
        }

        else -> {
            print("Error. ❌ Opción no válida")
            return
        }
    }

    val precioFinal = precioBase + ajuste
    print("El precio final del boleto es de $precioFinal pesos")
}