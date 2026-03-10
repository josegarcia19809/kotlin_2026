package org.example.p01_fundamentos

fun main() {
    var contador = 1
    var vecesSi = 0
    while (contador <= 3) {
        print("¿Te gusta el helado de limón? (S o N): ")
        val respuesta = readln()[0]
        if (respuesta == 'S' || respuesta == 's') {
            vecesSi++
        }
        contador++
    }
    println("$vecesSi personas eligieron helado de limón🍈🍦")
}