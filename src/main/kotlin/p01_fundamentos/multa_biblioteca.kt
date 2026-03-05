package org.example.p01_fundamentos

fun main() {
    println("Multa en una biblioteca 📚")

    print("Dime cantidad de días de retraso en la devolución del libro: ")
    val diasRetraso: Int = readln().toInt()

    print("Dime costo de la multa por cada día de retraso: ")
    val multaPorDia: Double = readln().toDouble()

    val multaTotal: Double = diasRetraso * multaPorDia
    println("Multa de retraso: $multaTotal")
}