package org.example.p01_fundamentos

fun main() {
    var contador = 1
    var alumnos6y7 = 0
    while (contador <= 6) {
        print("¿Cuál es tu calificacion? (0.0-10.0): ")
        val calificacion = readln().toDouble()
        if (calificacion >= 6 && calificacion <= 7) {
            alumnos6y7++
        }
        contador++
    }
    println("$alumnos6y7 alumnos están en el rango")
}