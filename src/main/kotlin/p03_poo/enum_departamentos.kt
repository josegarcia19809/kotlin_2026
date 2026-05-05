package org.example.p03_poo

enum class Departamento(
    val nombreCompleto: String,
    val numeroEmpleados: Int
) {
    RECURSOS_HUMANOS("Recursos Humanos", 5),
    TECNOLOGIA("Tecnología", 10),
    CONTABILIDAD("Contabilidad", 3),
    VENTAS("Ventas", 20);

    fun obtenerInformacion(): String {
        return "El departamento de $nombreCompleto tiene $numeroEmpleados empleados"
    }

    fun esGrande(): Boolean {
        return numeroEmpleados > 10
    }
}

fun main() {

    val departamento = Departamento.CONTABILIDAD

    println(departamento.obtenerInformacion())

    if (departamento.esGrande()) {
        println("Es un departamento grande 🏢")
    } else {
        println("Es un departamento pequeño 👨‍💼")
    }
}