package org.example

class Rectangulo(var longitud:Double, var anchura:Double){
    fun obtenerArea(): Double{
        return longitud * anchura
    }
    fun obtenerPerimetro():Double {
        return (longitud * 2) + (anchura * 2)
    }
}