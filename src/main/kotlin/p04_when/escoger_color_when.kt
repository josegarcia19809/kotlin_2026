package org.example.p04_when
// el color base es rojo
// combinaciones
// azul -> morado
// amarilllo -> naranja
// blanco -> rosa
// otro color -> tendrás que investigar


fun main() {
    println("Combinación de colores con rojo🛑")
    val color1 = "rojo"

    print("Dime con qué color lo quieres combinar: ")
    val color2 = readln()

    var nuevoColor = ""
    when (color2) {
        "azul" -> {
            nuevoColor = "morado 💜"
        }

        "amarillo" -> {
            nuevoColor = "naranja 🟠"
        }

        "blanco" -> {
            nuevoColor = "rosa 💗"
        }

        else -> {
            nuevoColor = "deberás investigar"
        }
    }
    println("Combinar $color1 y $color2, salida: $nuevoColor")

    println("-".repeat(100))
}