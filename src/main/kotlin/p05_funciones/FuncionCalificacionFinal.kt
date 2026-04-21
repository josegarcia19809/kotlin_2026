package org.example.p05_funciones

fun main() {
    println("Calificación con bonificación por participación")
    print("👨🏻‍🎓Dame tu calificación: ")
    val calificacion = readln().toDouble()

    print("🙋🏻‍♀️¿Participaste(true/false)? ")
    val participacion = readln().toBoolean()

    calcularCalificacionFinal(calificacion, participacion)
}

fun calcularCalificacionFinal(
    calificacion: Double,
    participacion: Boolean
) {
    val bono: Double
    if (participacion) {
        bono = calificacion * 0.10
    } else {
        bono = 0.0
    }
    val calificacionFinal = calificacion + bono
    print("calificacion final: $calificacionFinal")
}