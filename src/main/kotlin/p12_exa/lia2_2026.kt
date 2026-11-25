package org.example.p12_exa

class FacturaGaming(private val plan: Int, private val horasJugadas: Int) {
    fun calcularPago(): Double {
        var pago = 0.0

        when (plan) {
            1 -> {
                pago = 150.0
                if (horasJugadas > 15) {
                    val extra = horasJugadas - 15
                    pago += extra * 10
                }
            }

            2 -> {
                pago = 220.0
                if (horasJugadas > 25) {
                    val extra = horasJugadas - 25
                    pago += extra * 8
                }
            }

            3 -> {
                pago = 300.0
                if (horasJugadas > 40) {
                    val extra = horasJugadas - 40
                    pago += extra * 6
                }
            }
        }
        return pago
    }
}

fun main() {

    val materias = listOf(
        "Electrónica Digital",
        "Sistemas Operativos",
        "Protocolos De Red",
        "Administración De Redes"
    )

    println(materias)

    for (noLista in 1..17) {
        println("-".repeat(100))
        println("-".repeat(10) + "No lista: $noLista")
        val idUsuario = noLista
        val plan = (idUsuario % 3) + 1
        val horas = idUsuario * 5

        val factura = FacturaGaming(plan, horas)
        val total = factura.calcularPago()

        println("Plan: $plan")
        println("Total: $total")
        println()
    }
}
