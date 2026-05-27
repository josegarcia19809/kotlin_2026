package org.example.p03_poo

open class Vehiculo(
    var marca: String,
    var modelo: String,
    var kilometraje: Int,
    var precio: Double
) {
    override fun toString(): String {
        return """
            Marca: $marca
            Modelo: $modelo
            Kilometraje: $kilometraje
            Precio: $precio
        """.trimIndent()
    }
}

class Automovil(
    marca: String,
    modelo: String,
    kilometraje: Int,
    precio: Double,
    var puertas: Int
) : Vehiculo(marca, modelo, kilometraje, precio) {
    override fun toString(): String {
        return """
            ${super.toString()}
            Puertas: $puertas
        """.trimIndent()
    }
}

class Camioneta(
    marca: String,
    modelo: String,
    kilometraje: Int,
    precio: Double,
    var tipoTraccion: String
) : Vehiculo(marca, modelo, kilometraje, precio) {
    override fun toString(): String {
        return """
            ${super.toString()}
            Tipo de tracción: $tipoTraccion
        """.trimIndent()
    }
}

fun pruebaAutomovil() {
    println("-".repeat(100))
    val automovilUsado = Automovil("Audi", "2007", 12500, 21500.0, 4)
    println("🚗 Datos del automóvil usado: ")
    println(automovilUsado)
}

fun pruebaCamioneta() {
    println("-".repeat(100))
    val camionetaUsada = Camioneta("Toyota", "2002", 40000, 12000.0, "4WD")
    println("🛻 Datos de la camioneta usada: ")
    println(camionetaUsada)
}

fun main() {
    pruebaAutomovil()
    pruebaCamioneta()
}





