package org.example.p01_fundamentos

fun main() {
    println("👨🏻‍🎓Cálculo del promedio de calificaciones📝")

    print("¿Cuántos alumnos hay? ")
    val cantidadCalificaciones = readln().toInt()
    println()

    var sumaCalificaciones = 0.0
    for (i in 1..cantidadCalificaciones) {
        print("Ingresa la calificación del alumno $i: ")
        val calificacion = readln().toDouble()
        sumaCalificaciones = sumaCalificaciones + calificacion
    }

    val promedio: Double = sumaCalificaciones / cantidadCalificaciones
    println("Promedio del grupo: %.2f".format(promedio))
}