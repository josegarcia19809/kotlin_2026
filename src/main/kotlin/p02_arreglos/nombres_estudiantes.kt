package org.example.p02_arreglos

fun main() {
    println("Nombres de estudiantes")

    val nombres = Array(5) { "" }
    for (i in 0..4) {
        print("Dame nombre del estudiante ${i + 1}: ")
        nombres[i] = readln()
    }
    println("-".repeat(100))
    println("Los nombres son: ")
    for (nombre in nombres) {
        println(nombre)
    }
    println("Se ingresaron ${nombres.size} nombres")

}