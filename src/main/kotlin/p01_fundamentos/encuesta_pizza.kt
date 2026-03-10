package org.example.p01_fundamentos

fun main() {
    var contador = 1
    var pizzeros = 0
    while (contador <= 4) {
        print("¿Te gusta la pizza con piña? (S o N): ")
        val respuesta = readln()[0]
        if (respuesta == 'S' || respuesta == 's') {
            pizzeros++
        }
        contador++
    }
    println("A $pizzeros persona(s) le(s) gusta la pizza con piña")
}