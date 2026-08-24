package org.example.p01_fundamentos

fun main() {
    println("Pedido de Pizzas 🍕")

    print("¿Cuántas pizzas deseas ordenar? ")
    val cantidad: Int = readln().toInt()

    var total = 0.0
    for (i in 1..cantidad) {
        println("Pizza $i")
        println("Tamaños")
        println("1- Chica")
        println("2- Mediana")
        println("3- Grande")
        print("Escoge tu opción: ")
        val opcion = readln().toInt()

        val precio = when (opcion) {
            1 -> 100.0
            2 -> 140.0
            3 -> 180.0
            else -> 0.0
        }
        println("Precio: $precio")
        total += precio
        println("-".repeat(100))
    }

    println("Total de la compra: $total")
}