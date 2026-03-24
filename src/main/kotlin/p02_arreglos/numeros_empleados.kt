package org.example.p02_arreglos

fun main() {
    val numerosEmpleados = IntArray(9)
    numerosEmpleados[0] = 20
    numerosEmpleados[8] = 36

    for (numero in numerosEmpleados) {
        println(numero)
    }
}