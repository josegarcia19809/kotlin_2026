package org.example.p02_arreglos

fun main() {
    println("Edades acumuladas y clasificación por mayoría de edad 👱🏻‍♀️")

    var sumaEdades = 0
    var mayores = 0
    var menores = 0
    val edades = IntArray(10)

    for (i in 0..9) {
        println("Edad de persona ${i + 1}: ")
        edades[i] = readln().toInt()

        sumaEdades = sumaEdades + edades[i]
        if (edades[i] >= 18) {
            mayores++
        } else {
            menores++
        }
    }
    println("-".repeat(100))
    println("Suma de edades: $sumaEdades")
    println("Mayores: $mayores")
    println("Menores: $menores")

    // Imprimir todas las edades
    for (edad in edades) {
        print("$edad \t")
    }


}