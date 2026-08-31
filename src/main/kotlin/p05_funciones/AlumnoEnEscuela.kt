package org.example.p05_funciones

fun estaAprobado() {
    println("Estas aprobado 😁")
}

fun noEstaAprobado() {
    println("No estas aprobado 😭")
}

fun main() {
    println("Bienvenido al sistema de calificaciones")

    print("Dame tu calificación (0.0 a 10.0): ")
    val calificacion = readln().toDouble()

    print("Dame tu porcentaje de asistencias: ")
    val porcentaje = readln().toInt()

    if (calificacion >= 6.0 && porcentaje >= 80) {
        estaAprobado()
    } else {
        noEstaAprobado()
    }
}

