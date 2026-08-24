package org.example.p01_fundamentos

// Programa de revisión de mochila
fun main() {
    println("👀 Vamos a revisar tu mochila 🎒")
    print("¿Cuántas materias✏️ tienes hoy? ")
    val materias = readln().toInt()

    for (i in 1..materias) {
        print("Materia $i: ")
        val nombreMateria = readln()

        println("¿Qué necesitas llevar? ")
        println("1.- Libro 📚")
        println("2.- Cuaderno 📓")
        println("3.- Computadora 🧑‍💻")
        println("4.- Material especial ✏️")
        print("Escoge tu opción: ")
        val opcion = readln().toInt()

        when (opcion) {
            1 -> println("Debes llevar tu libro 📕 para $nombreMateria")
            2 -> println("Lleva tu cuaderno 📔 para $nombreMateria")
            3 -> println("No se te olvide tu computadora 💻 para $nombreMateria")
            4 -> println("Agrega tu material especial ✏️ para $nombreMateria")
            else -> println("Opción no válida 🤪")
        }
        println("-".repeat(100))
    }
}