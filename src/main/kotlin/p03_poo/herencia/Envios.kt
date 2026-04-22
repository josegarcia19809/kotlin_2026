package org.example.p03_poo.herencia

fun main() {
    val envioExpress = EnvioExpress("Guadalajara", "CDMX", 2.5)
    println("Costo final: ${envioExpress.calcularCosto()}")
}


open class Envio(val origen: String, val destino: String) {

    init {
        println("📦 Registrando envío de $origen a $destino")
    }

    open fun calcularCosto(): Double {
        return 50.0 // costo base
    }
}

class EnvioExpress(
    origen: String,
    destino: String,
    val peso: Double
) : Envio(origen, destino) {

    init {
        println("⚡ Envío express configurado con peso de $peso kg")
    }

    override fun calcularCosto(): Double {
        val costoBase = super.calcularCosto()
        return costoBase + (peso * 10)
    }
}
