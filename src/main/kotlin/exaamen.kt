package org.example

class Empleado(val nombre: String, val edad: Int, var salario: Double) {
    fun aumentarSalario(porcentaje: Double) {
        val incremento = salario * (porcentaje / 100.0)
        salario = salario + incremento
    }

    fun obtenerInformacion(): String {
        val info = "Nombre: $nombre, edad: $edad, salario: $salario"
        return info
    }
}

fun main() {

    val empleado1 = Empleado("Juan", 25, 12000.0)
    val empleado2 = Empleado("Ana", 30, 15000.0)

    println("=== Empleado 1 ===")
    println(empleado1.obtenerInformacion())
    empleado1.aumentarSalario(10.0)
    println(empleado1.obtenerInformacion())

    println("\n=== Empleado 2 ===")
    println(empleado2.obtenerInformacion())
    empleado2.aumentarSalario(10.0)
    println(empleado2.obtenerInformacion())
}