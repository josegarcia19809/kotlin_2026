package org.example.p01_fundamentos

fun main() {
    println("LONCHERÍA TES VENADOS")

    print("Dime el precio de una torta: ")
    val precio = readln().toDouble()

    println("Cantidad-tortas\tTotal")
    println(".".repeat(50))
    for (cantidad in 1..10) {
        val total = precio * cantidad
        println("$cantidad\t\t\t\t$$total")
    }
}


// for (cantidad in 12..48 step 4) Quesadillas
// for (cantidad in 20 downTo 10) tacos
// aguas del 10 al 100 de 10 en 10







