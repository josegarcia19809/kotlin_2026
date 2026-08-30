package org.example.p01_fundamentos

fun main(){
    print("¿Cuánto dinero tienes? ")
    val dinero = readln().toDouble()

    print("¿Cuánto cuesta el videojuego? ")
    val precio = readln().toDouble()

    if (dinero >= precio) {
        println("🎮 ¡Puedes comprar el videojuego!")
    } else {
        println("💸 Te falta dinero")
    }
}