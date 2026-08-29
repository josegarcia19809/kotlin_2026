package org.example.p02_arreglos

fun main() {
    println("Registro de tiempos de corredores 🏃")
    val tiempos = arrayOf(58, 50, 25, 15, 36)

    var mayor = tiempos[0]
    for (tiempo in tiempos) {
        if (tiempo > mayor) {
            mayor = tiempo
        }
        println(tiempo)
        if (tiempo < 20) {
            println("Excelente")
        } else if (tiempo in 20..25) {
            println("Muy buen tiempo")
        } else if (tiempo in 26..30) {
            println("Buen tiempo")
        } else {
            println("Necesita mejorar")
        }

        println("Dime el nivel de entrenamiento del corredor")
        println("1. Pricipiante")
        println("2. Intermedio")
        println("3. Avanzado")
        print("Elige tu opción: ")
        val opcion = readln().toInt()

        when (opcion) {
            1 -> println("Entrena más")
            2 -> println("Vas bien")
            3 -> println("Eres nivel pro")
        }
        println()
        println("-".repeat(100))
    }
    println("El mayor tiempo fue: $mayor")

}