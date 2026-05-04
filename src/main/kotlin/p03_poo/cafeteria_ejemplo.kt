package org.example.p03_poo

import java.time.Year

fun main() {

    println(CafeteriaComunicados.getEslogan())
    println(CafeteriaComunicados.getMensajeDerechos())

    println(Bebida.accederContadorInterno())

    val bebida1 = Bebida.crearTalCual("Café latte")
    val bebida2 = Bebida.mayusculaOMinuscula("capuccino especial", false)

    println(bebida1.nombre)
    println(bebida2.nombre)
}

object CafeteriaComunicados {

    val anioActual = Year.now().value

    fun getEslogan() = "¡El mejor café de la ciudad!"
    fun getMensajeDerechos() = "© $anioActual Cafetería Aroma. Todos los derechos reservados."
}

class Bebida private constructor(val nombre: String) {

    companion object {
        private var contadorInterno = 10

        fun accederContadorInterno() = "Bebidas registradas: $contadorInterno"

        fun crearTalCual(nombre: String) = Bebida(nombre)

        fun mayusculaOMinuscula(nombre: String, minuscula: Boolean): Bebida {
            return if (minuscula) {
                Bebida(nombre.lowercase())
            } else {
                Bebida(nombre.uppercase())
            }
        }
    }
}