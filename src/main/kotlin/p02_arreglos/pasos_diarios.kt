package p02_arreglos

/*
 * Programa de seguimiento de pasos diarios
 * Calcula el total, el promedio y el día con mayor cantidad de pasos.
 */

fun main() {
    val pasos_por_dia = arrayOf(500, 1000, 200, 300, 12, 1500, 500)

    var total_pasos = 0

    for (pasos in pasos_por_dia) {
        total_pasos += pasos
    }

    println("Total de pasos: $total_pasos")

    val promedio_pasos = total_pasos / 7.0
    println("Promedio: ${"%.1f".format(promedio_pasos)}")

    // Obtener el índice del día con mayor cantidad de pasos
    var indice_maximo = 0

    for (i in 1 until pasos_por_dia.size) {
        if (pasos_por_dia[i] > pasos_por_dia[indice_maximo]) {
            indice_maximo = i
        }
    }

    val dias_semana = arrayOf(
        "domingo", "lunes", "martes", "miércoles",
        "jueves", "viernes", "sábado"
    )

    println()
    println("Día de mayor cantidad de pasos: ${dias_semana[indice_maximo]}")
}