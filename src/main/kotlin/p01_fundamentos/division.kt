package org.example.p01_fundamentos

fun main() {

    print("Ingresa el primer número: ")
    val numero1 = readln().toDouble()

    print("Ingresa el segundo número: ")
    val numero2 = readln().toDouble()

    if (numero2 == 0.0) {
        println("❌ Error: no se puede dividir entre cero")
    } else {
        val resultado = numero1 / numero2
        println("🧮 Resultado: $resultado")
    }
}


