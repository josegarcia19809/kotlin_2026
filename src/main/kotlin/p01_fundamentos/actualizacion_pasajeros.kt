package p01_fundamentos

/*
 * Por: Ing. José L. García M. 8 de septiembre de 2026, 18:24
 *
 * Este programa actualiza los pasajeros que suben y bajan de un camión.
 */

fun main() {

    var pasajeros = 0

    println("------------------------------------------------")
    println("Programa para actualizar la cantidad de pasajeros que suben y bajan de " +
            "un camión")

    // Primera parada: Suben 30
    pasajeros = pasajeros + 30
    println("1. Pasajeros: $pasajeros")

    // Segunda parada: Bajan 10, Suben 4
    pasajeros = pasajeros - 10
    pasajeros = pasajeros + 4
    println("2. Pasajeros: $pasajeros")

    // Tercera parada: Bajan 8, Suben 2
    pasajeros -= 8
    pasajeros += 2
    println("3. Pasajeros: $pasajeros")

    // Cuarta parada: Baja 1, Suben 2
    pasajeros -= 1
    pasajeros += 2
    println("4. Pasajeros: $pasajeros")

    // Quinta parada: Baja 1, Sube 1
    pasajeros--
    pasajeros++
    println("5. Pasajeros: $pasajeros")
}