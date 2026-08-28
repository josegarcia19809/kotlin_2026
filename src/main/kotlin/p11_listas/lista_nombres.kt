package org.example.p11_listas

fun main() {
    val nombres = mutableListOf<String>("Ana", "Luis", "Carlos")

    nombres.add("María") // "Ana", "Luis", "Carlos", "María"
    nombres.remove("Luis") // "Ana", "Carlos", "María"
    nombres[0] = "Andrea" // "Andrea", "Carlos", "María"
    println(nombres)
}