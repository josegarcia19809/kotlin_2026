package org.example.p12_exa

fun main() {
    for (noLista in 1..9) {
        println("-".repeat(50) + noLista)

        val ventas = arrayOf(850.0, 1200.0, 950.0, 1500.0, 700.0, 1100.0, 1350.0)
        var total = noLista * 2.0

        for (venta in ventas) {
            total += venta
        }

        var diasMeta = 0
        for (venta in ventas) {
            if (venta >= 1000.0) {
                diasMeta++
            }
        }

        println("total: $total")
        println("diasMeta: $diasMeta")

        val minutosEjercicio = arrayOf(20, 45, 60, noLista + 15, 50, 30)

        var totalMinutos = 0.0
        var entrenamientos = 0
        var promedioMinutos = 0.0

        for (minutos in minutosEjercicio) {

            if (minutos >= 40) {
                entrenamientos++
                totalMinutos += minutos
            }
        }

        promedioMinutos = totalMinutos / entrenamientos

        println("promedioMinutos: $promedioMinutos")
        println()
    }

}
