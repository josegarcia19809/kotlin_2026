package p01_fundamentos

// escala_calificacion
// Created by Jose Garcia on 06/03/26.
// Este programa servirá para asignar una calificación en letra

fun main() {

    var calificacion: Int

    println("Bienvenido a tu sistema de calificaciones")

    print("Ingresa tu calificación del examen: ")
    calificacion = readln().toInt()

    if (calificacion < 60) {
        println("Tu calificación es F ❌")
    } else if (calificacion < 70) {
        println("Tu calificación es D 🥹")
    } else if (calificacion < 80) {
        println("Tu calificación es C 😌")
    } else if (calificacion < 90) {
        println("Tu calificación es B 😀")
    } else {
        println("Tu calificación es A 😁")
    }
}