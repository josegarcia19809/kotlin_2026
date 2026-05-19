package org.example.p03_poo

class VideojuegoGamer(
    val nombreJuego: String,
    var puntos: Int
) {
    fun ganarPuntos(cantidad: Int) {
        puntos += cantidad
    }

    fun perderPuntos(cantidad: Int) {
        if (cantidad <= puntos) {
            puntos -= cantidad
        } else {
            println(
                "No se puede perder más puntos de los " +
                        "que se tiene"
            )
        }
    }

    fun obtenerPuntos(): Int {
        return puntos
    }

    override fun toString(): String {
        return "Videojuego: $nombreJuego, puntos: $puntos"
    }
}

fun main() {
    println("🕹️Sistema de Puntajes para un Videojuego Gamer")
    val videojuego = VideojuegoGamer("Halo 3", 20);

    videojuego.ganarPuntos(10)
    videojuego.ganarPuntos(15)
    println("Puntos acumulados: ${videojuego.obtenerPuntos()}")

    videojuego.perderPuntos(12)
    videojuego.perderPuntos(15)
    println("Puntos acumulados: ${videojuego.obtenerPuntos()}")

    println()
    println("Datos actuales del juego")
    println(videojuego)
}