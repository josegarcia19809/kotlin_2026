package org.example.p01_fundamentos

fun main() {
    println("🎵 Venta de boletos para concierto")

    // 1. Definir el precio del boleto
    val costoBoleto: Double = 250.0

    // 2. Pedir al usuario la cantidad de boletos comprados
    print("¿Cuántos boletos compraste?: ")
    val boletos: Int = readln().toInt()

    // 3. Calcular el total a pagar
    val pagoTotal: Double = boletos * costoBoleto

    // 4. Evaluar la condición
    if (pagoTotal == 1000.0) {
        println("Recibes un póster oficial del concierto.")
    } else {
        println("Solo recibes tus boletos.")
    }

    // 5. Mostrar el total pagado
    println("Total pagado: $$pagoTotal pesos")
}