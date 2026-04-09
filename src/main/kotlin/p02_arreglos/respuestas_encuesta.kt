package org.example.p02_arreglos

fun main() {
    println("Respuestas de encuesta (Sí/No) 📝")
    val total = 12
    val respuestas = BooleanArray(total)

    var verdaderas = 0
    var falsas = 0

    for (i in 0 until total) {
        print("Ingresa la respuesta ${i + 1} (true/false): ")
        respuestas[i] = readln().toBoolean()

        if (respuestas[i] == true) {
            verdaderas++
        } else {
            falsas++
        }
    }

    println("\n📊 Resultados:")
    println("✔️ Respuestas verdaderas: $verdaderas")
    println("❌ Respuestas falsas: $falsas")

    println("\n📋 Lista completa de respuestas:")
    for (respuesta in respuestas) {
        print("$respuesta \t")
    }
}