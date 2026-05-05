package org.example.p03_poo

interface SistemaCalculoViaje {
    fun calcularIngreso(pasajeros: Int): String
}

fun procesarViaje(sistema: SistemaCalculoViaje) {
    println("Resultado del viaje: ${sistema.calcularIngreso(22)}")
}

fun main() {

    procesarViaje(object : SistemaCalculoViaje {
        override fun calcularIngreso(pasajeros: Int): String {

            val precioBoleto = 100
            val ingreso = pasajeros * precioBoleto

            return "Ingreso total del viaje: $ingreso pesos"
        }
    })

}