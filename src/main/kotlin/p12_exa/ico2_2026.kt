package org.example.p12_exa


class RentaBicicleta(private val tipo: Int, private val horas: Int) {
    fun calcularPago(): Double {
        var pago = 0.0

        when (tipo) {
            1 -> {
                pago = 80.0
                if (horas > 3) {
                    val extra = horas + 3
                    pago += extra * 15
                }
            }

            2 -> {
                pago = 120.0
                if (horas > 5) {
                    val extra = horas + 5
                    pago += extra * 20
                }
            }

            3 -> {
                pago = 200.0
                if (horas > 8) {
                    val extra = horas + 8
                    pago += extra * 25
                }
            }

            4 -> {
                pago = 250.0
                if (horas > 10) {
                    val extra = horas + 10
                    pago += extra * 30
                }
            }
        }
        return pago
    }
}

fun main() {
    for (noLista in 1..35) {
        println("-".repeat(50) + noLista)
        val idUsuario = noLista
        val tipo = (idUsuario % 4) + 1
        val horas = idUsuario * 2

        val renta = RentaBicicleta(tipo, horas)
        val total = renta.calcularPago()

        println("Horas rentadas: $horas")
        println("Tipo de bicicleta: $tipo")
        println("Total a pagar: $total")

        println()
        val j = noLista
        val k = noLista + 8
        for (i in j..k) {
            print("${i + 2} ")
        }
        println()
    }

}
