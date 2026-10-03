package org.example.p12_exa

fun main() {
    for (noLista in 10..17) {
        println("-".repeat(50)+ noLista)

        val temperaturas = arrayOf(22.5, 25.0, 27.5, 30.0, 24.5, 28.0, 31.5)
        var promedioBase = noLista + 5.0

        for (temperatura in temperaturas) {
            promedioBase += temperatura
        }

        var diasCalurosos = 0
        for (temperatura in temperaturas) {
            if (temperatura >= 28.0) {
                diasCalurosos++
            }
        }

        println("promedioBase: $promedioBase")
        println("diasCalurosos: $diasCalurosos")

        // val noLista = ________________
        val ahorros = arrayOf(50, 100, 80, noLista + 20, 150, 60)

        var totalAhorro = 0.0
        var semanasMeta = 0
        var promedioAhorro = 0.0

        for (ahorro in ahorros) {
            if (ahorro >= 100) {
                semanasMeta++
                totalAhorro += ahorro
            }
        }

        promedioAhorro = totalAhorro / semanasMeta

        println("promedioAhorro: $promedioAhorro")
        println()
    }
}