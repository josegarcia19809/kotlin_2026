package org.example.p03_poo

open class Docente {
    open val nombre = "María López"
    val asignatura = "Programación I"
    open fun mostrarInfo() {
        println(
            "El (la) docente $nombre imparte " +
                    "la asignatura $asignatura"
        )
    }
}

class Tutor : Docente() {
    override val nombre="Carlos Pérez"

    override fun mostrarInfo() {
        println("El tutor $nombre, apoya en la " +
                "asignatura $asignatura " +
                "del (de la) docente ${super.nombre}")
    }
}

fun main() {
    val mi_docente = Docente()
    val mi_tutor = Tutor()

    mi_docente.mostrarInfo()
    mi_tutor.mostrarInfo()
}