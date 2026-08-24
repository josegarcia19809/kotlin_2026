package org.example.p01_fundamentos

// 🌡️ Conversión de temperatura
fun main() {
    println("Conversión de temperaturas 🌡️")

    print("Dame grados Celsius a convertir: ")
    val gradosCelsius = readln().toDouble()

    val gradosFahrenheit = (gradosCelsius * 9 / 5) + 32

    println("$gradosCelsius ºC equivale a $gradosFahrenheit ºF")
}