package org.example.p02_arreglos

fun main() {
    val cantidades: Array<Int> = arrayOf(5, 3, 6, 2, 8)
    val productos: Array<String> = arrayOf(
        "capuchino", "malteada", "cafe americano",
        "cafe latte", "matcha"
    )
    var indice = 0
    for (cantidad in cantidades) {
        println(cantidad)
        if (cantidad == 0) {
            println(productos[indice])
            println("Agotado")
        } else if (cantidad >= 1 && cantidad <= 5) {
            println(productos[indice])
            println("Stock crítico")
        } else if (cantidad >= 6 && cantidad <= 15) {
            println(productos[indice])
            println("Stock bajo")
        } else if (cantidad > 15) {
            println("Stock suficiente")
        }

        println("1. Bebida ")
        println("2. Alimento ")
        println("3. Postre")
        println("Elije tu opcion")
        val opcion = readln().toInt()
        when (opcion) {
            1 -> println("Bebida ")
            2 -> println("Alimento")
            3 -> println("Postre")
        }
        indice += 1
    }
}