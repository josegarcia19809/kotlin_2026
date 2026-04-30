package org.example.p03_poo

import java.time.Year

fun main(args: Array<String>) {

    println(PeluqueriaComunicados.getSlogan())
    println(PeluqueriaComunicados.getMensajeLegal())
}

object PeluqueriaComunicados {

    val anioActual = Year.now().value

    fun getSlogan() = "¡Tu estilo, nuestra pasión! 💇‍♂️✨"

    fun getMensajeLegal() =
        "Copyright \u00A9 $anioActual Peluquería Estilo Único. Todos los derechos reservados."
}