package org.example.p02_arreglos

fun main() {
    // Primera forma de escribir un arreglo
    val numeros: Array<Int>
    numeros = Array(6) { 0 }

    println("Valores del primer arreglo")
    for (i in 0..5) {
        print("${numeros[i]} ")
    }
    println()

    // Segunda forma de escribir un arreglo
    val numeros2: Array<Int> = Array(6) { 0 }
    println("Valores del segundo arreglo")
    for (i in 0..5) {
        print("${numeros2[i]} ")
    }
    println()

    // Tercera forma de escribir un arreglo
    val numElementos = 6
    val numeros3: Array<Int> = Array(numElementos) { 0 }
    println("Valores del tercer arreglo")
    for (i in 0..5) {
        print("${numeros3[i]} ")
    }
    println()
}