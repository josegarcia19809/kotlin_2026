package org.example.p05_funciones

fun estaAprobado() {
    println("Estas aprobado")
}

fun noEstaAprobado() {
    println("No estas aprobado")
}

fun main() {
    println("Dime tu calificacion: ")
    val calificacion = readln().toInt()
    println("Dime tu porcentaje de asistencias : ")
    val porcentaje = readln().toInt()
    if (calificacion >= 70 && porcentaje >= 80) {
        estaAprobado()
    } else {
        noEstaAprobado()
    }
}