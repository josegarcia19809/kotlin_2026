package org.example.p01_fundamentos

/*
🎮 Calcular el total a pagar por la compra de paquetes de monedas en un videojuego y
determinar si el jugador recibe un bono de monedas extra.
*/

fun main() {

    // Precio de cada paquete
    val precioPaquete: Int = 15

    // Pedir al usuario la cantidad de paquetes
    print("¿Cuántos paquetes de monedas quieres comprar? ")
    val paquetes: Int = readln().toInt()

    // Calcular el total
    val total: Int = paquetes * precioPaquete

    // Mostrar el total a pagar
    println("Total a pagar: $total pesos")

    // Evaluar si recibe el bono
    if (total >= 150) {
        println("Recibes 100 monedas extra.")
    } else {
        println("Compra normal sin bono.")
    }
}