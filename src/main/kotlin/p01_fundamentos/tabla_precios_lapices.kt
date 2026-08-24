package org.example.p01_fundamentos

// tabla_precios_lapices

fun main() {
    // Los incrementos serán de 2 en 2 para la cantidad de lapices
    println("LAPICES ($8.00)")
    println("LAPICES\t\tCOSTO")
    for (cantidad in 2..18 step 2) {
        val costo = cantidad * 8
        println("$cantidad\t\t\t $costo")
    }
    println("-".repeat(100))

    // Decrementos de 10 a 1
    println("GOMAS($6.00)")
    println("GOMAS\t\tCOSTO")

    for (cantidad in 10 downTo 1) {
        println("$cantidad\t\t\t ${cantidad * 6}")
    }
    println("-".repeat(100))
}