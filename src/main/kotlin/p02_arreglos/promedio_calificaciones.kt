package p03_colecciones

fun main() {
    val calificaciones: Array<Int> =
        arrayOf(80, 95, 70, 85, 90)
    var suma = 0

    for (calificacion in calificaciones) {
        suma += calificacion
    }

    val promedio = suma.toDouble() / calificaciones.size
    println("Promedio: $promedio")
}