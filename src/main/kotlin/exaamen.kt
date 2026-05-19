package org.example

class Rectangulo(val longitud: Double, val anchura: Double) {
    fun obtenerArea(): Double {
        return longitud * anchura
    }

    fun obtenerPerimetro(): Double {
        return (longitud * 2) + (anchura * 2)
    }
}