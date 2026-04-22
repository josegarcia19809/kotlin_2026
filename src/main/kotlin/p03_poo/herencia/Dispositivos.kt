package org.example.p03_poo.herencia

fun main(args: Array<String>) {
    val equipoLaser = DispositivoLaser("HP 5678", 20)
    equipoLaser.mostrarModelo()
}


abstract class Dispositivo(val modelo: String) {

    open fun mostrarModelo() = println("El modelo del dispositivo es $modelo")
    abstract fun calcularPrecio(): Double

}

open class DispositivoLaser(modelo: String, val velocidadPPM: Int) : Dispositivo(modelo) {

    final override fun mostrarModelo() = println("El modelo del dispositivo láser es $modelo")
    override fun calcularPrecio(): Double = 149.99

}

class DispositivoLaserPro(modelo: String, velocidadPPM: Int) :
    DispositivoLaser(modelo, velocidadPPM) {

}