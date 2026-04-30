package org.example.p03_poo

interface VideojuegoI {

    val horasJugadas: Int

    val puntos: Int
        get() = horasJugadas * 10

    fun mostrarInfo(): String

}

interface VideojuegoOnline : VideojuegoI {

    fun jugarEnLinea(): String

}

class Fortnite : VideojuegoOnline {

    override val horasJugadas: Int = 5

    override fun mostrarInfo(): String {
        return "Fortnite - Horas: $horasJugadas - Puntos: $puntos"
    }

    override fun jugarEnLinea(): String {
        return "Conectando a partida online..."
    }

}

fun main() {
    val juego = Fortnite()

    println(juego.mostrarInfo())
    println(juego.jugarEnLinea())
}