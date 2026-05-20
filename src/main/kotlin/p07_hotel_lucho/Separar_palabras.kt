package org.example.p07_hotel_lucho

fun main() {
    val linea = "Homero|300|400|trabajo"
    val valores = linea.split("|")

    val nombre = valores[0]
    val ingresos = valores[1].toDouble()
    val egresos = valores[2].toDouble()
    val origen = valores[3]

    val saldoFinal = ingresos - egresos

    println(nombre)
    println(ingresos)
    println(egresos)
    println(origen)
    println(saldoFinal)
}