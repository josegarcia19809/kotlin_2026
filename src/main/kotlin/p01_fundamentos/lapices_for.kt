package org.example.p01_fundamentos

fun main() {
    println("Lapices. De 5 en 5. ✏️✏️✏️✏️✏️")
    print("Dame el precio del lapiz: ")
    val precio = readln().toDouble()
    println()
    println("Cantidad\tPrecio")
    println("_".repeat(50))
    for (cantidadLapices in 5..50 step 5) {
        val total = precio * cantidadLapices
        println("$cantidadLapices\t\t\t$$total")
    }
}