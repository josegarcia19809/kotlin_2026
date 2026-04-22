package org.example.p03_poo.herencia

fun main() {
    val impresoraLaser = ImpresoraLaser("Brother 1234")
    impresoraLaser.imprimirModelo()
}


abstract class Impresora(val nombreModelo: String) {

    open fun imprimirModelo() = println("El modelo de esta impresora es $nombreModelo")
    abstract fun precioVenta(): Double

}

open class ImpresoraLaser(nombreModelo: String) : Impresora(nombreModelo) {

    final override fun imprimirModelo() =
        println("El modelo de esta impresora láser es $nombreModelo")

    override fun precioVenta(): Double = 129.99

}
