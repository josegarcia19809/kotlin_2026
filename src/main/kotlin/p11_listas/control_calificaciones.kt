package org.example.p11_listas

fun main() {
    println("Control de calificaciones 📝")
    val calificaciones = mutableListOf(9, 6, 8, 5, 10, 7)

    var aprobados = 0
    var reprobados = 0

    for (calificacion in calificaciones) {
        print(calificacion)
        if (calificacion >= 7) {
            println(" aprobado 😄")
            aprobados++
        } else {
            println(" no aprobado 😭")
            reprobados++
        }
    }

    println()
    println("✅ Aprobados: $aprobados")
    println("❌ No aprobados: $reprobados")
}