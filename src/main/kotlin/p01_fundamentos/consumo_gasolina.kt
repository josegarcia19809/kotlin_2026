package org.example.p01_fundamentos

fun main() {
    var contador = 1
    var pocosLitros = 0
    var muchosLitros = 0
    while (contador <= 6) {
        print("¿Cuántos litros de gasolina consumiste? ")
        val litros = readln().toInt()
        if (litros < 40) {
            pocosLitros++
        } else {
            muchosLitros++
        }
        contador++
    }
    println("$pocosLitros consumieron menos de 40 litros")
    println("$muchosLitros consumieron 40 litros o mas")
}