package org.example.p05_funciones

fun sumar(numero1: Double, numero2: Double) {
    val resultado = numero1 + numero2
    println("La suma es $resultado")
}

fun main() {
    sumar(1.0, 1.0)
    sumar(300.0, 400.0)
    sumar(40.0, 20.0)
}