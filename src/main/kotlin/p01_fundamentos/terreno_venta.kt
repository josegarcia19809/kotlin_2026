package org.example.p01_fundamentos

fun main() {
    var largoTerreno: Double = 0.0
    var anchoTerreno: Double = 0.0

    print("Escribe el largo del terreno: ")
    largoTerreno = readln().toDouble()

    print("Escribe el ancho del terreno: ")
    anchoTerreno = readln().toDouble()

    val areaTerreno: Double = largoTerreno * anchoTerreno

    if (areaTerreno > 500.0) {
        println("El terreno es grande")
    } else {
        println("El terreno es pequeño")
    }
    println("Área del terreno: $areaTerreno metros cuadrados")
}