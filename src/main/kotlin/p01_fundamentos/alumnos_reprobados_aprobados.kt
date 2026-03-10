package org.example.p01_fundamentos

fun main() {
    var contador = 1
    var aprobados = 0
    var reprobados = 0
    while (contador <= 6) {
        print("Ingresa la calificación (0.0 - 10.0): ")
        val calificacion = readln().toDouble()
        if (calificacion < 6) {
            reprobados++
        } else {
            aprobados++
        }
        contador++
    }
    println("$aprobados alumnos aprobados ")
    println("$reprobados alumnos reprobados")
}