package org.example.p02_arreglos

fun main() {
    println("Calificaciones acumuladas y aprobados ✅")
    val calificaciones = DoubleArray(6)
    var total = 0.0
    var aprobados = 0

    for (i in 0..5) {
        print("Ingrese su calificacion ${i + 1}: ")
        calificaciones[i] = readln().toDouble()
        total = total + calificaciones[i]
        if (calificaciones[i] >= 6.0) {
            aprobados++
        }
    }
    println("-".repeat(100))
    println("Total de aprobados: $aprobados")
    println("Suma de calificaciones: $total")
    for (calificacion in calificaciones) {
        print("$calificacion \t")
    }
    println()
}