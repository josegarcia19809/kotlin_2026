package p03_colecciones

fun main() {
    val calificaciones = arrayOf(90, 80, 70, 40, 100)

    var sumaCalificaciones = 0
    for (calificacion in calificaciones) {
        sumaCalificaciones += calificacion
        println(calificacion)
        if (calificacion < 60) {
            println("Reprobado 😩")
        } else if (calificacion >= 60 && calificacion <= 69) {
            println("Suficiente 😤")
        } else if (calificacion >= 70 && calificacion <= 89) {
            println("Buen desempeño 😊")
        } else if (calificacion >= 90) {
            println("Excelente desempeño 😎")
        }
    }

    val promedio = sumaCalificaciones.toDouble() / calificaciones.size
    println()
    println("Promedio: $promedio")
    when {
        promedio < 60 -> {
            println("Grupo en riesgo ⚠️")
        }
        promedio >= 60 && promedio < 70 -> {
            println("Grupo con desempeño básico 😏")
        }
        promedio >= 70 && promedio < 90 -> {
            println("Grupo con buen desempeño ☺️")
        }
        promedio >= 90 && promedio < 100 -> {
            println("Grupo sobresaliente ✔️")
        }
    }
}