package org.example.p02_arreglos

fun main() {
    val numeros: Array<Int> = arrayOf(15, 8, 32, 21, 10)

    var mayor = numeros[0]

    for (numero in numeros) {
        if (numero > mayor) {
            mayor = numero
        }
    }

    println("El número mayor es: $mayor")
}
