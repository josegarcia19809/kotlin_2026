package org.example.p05_funciones

fun main() {
    println("Pago de electricidad según tu consumo💡⚡️")
    println("-".repeat(100))

    print("¿Cuánto es el consumo base? ")
    val consumo = readln().toDouble()

    menuTipoConsumo()
    val tipo = readln().toInt()

    calcularPagoTotal(consumo, tipo)
}

fun menuTipoConsumo() {
    println("1. 🌱Consumo bajo -> sin cargo extra")
    println("2. 🏠Consumo medio -> +100 pesos")
    println("3. ⚡️Consumo alto -> +250 pesos")
    println("4. 🔥Consumo excesivo -> +400 pesos")
    print("Elige tu opción: ")
}

fun calcularPagoTotal(consumo: Double, tipoConsumo: Int) {
    var cargo = 0.0
    when (tipoConsumo) {
        1 -> {
            cargo = 0.0
        }

        2 -> {
            cargo = 100.0
        }

        3 -> {
            cargo = 250.0
        }

        4 -> {
            cargo = 400.0
        }

        else -> {
            print("opcion no valida")
            return
        }
    }
    val totalPagar = consumo + cargo
    println("el total a pagar es $totalPagar pesos")
}