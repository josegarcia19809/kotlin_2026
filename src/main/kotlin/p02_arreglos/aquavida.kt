package p02_arreglos

/*
 * Programa elaborado por José L. García M
 * Fecha: 27 de marzo de 2025
 * Este programa suma el total de litros consumidos durante una semana en un
 * edificio de AquaVida.
 */

fun main() {
    val litros = arrayOf(300, 500, 700, 600, 100, 400, 250)
    var litros_consumidos = 0

    for (litro in litros) {
        litros_consumidos += litro
    }

    // Mostrar total de litros consumidos
    println("Litros consumidos: $litros_consumidos")

    // Sacar el promedio y mostrarlo
    val dias = litros.size
    val promedio_consumo = litros_consumidos.toDouble() / dias

    println("Promedio: %.2f".format(promedio_consumo))
}