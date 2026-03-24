package org.example.p02_arreglos

fun main() {
    println("👨🏻‍🎓 Pago por clases impartidas")

    val docentes = 7
    val horas = IntArray(docentes)
    for (i in 0 until docentes) {
        print("Dame las horas de clase del docente ${i + 1}: ")
        horas[i] = readln().toInt()

    }
    println()

    print("Dime el pago por hora: ")
    val pagoHora = readln().toDouble()

    println("-".repeat(100))
    for (i in 0 until docentes) {
        val pagoTotal = horas[i] * pagoHora
        println("El docente ${i + 1} recibe de pago $pagoTotal pesos")

    }
}