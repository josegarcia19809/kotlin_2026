package org.example.p03_poo

class Alumno(
    val noCuenta: String, val nombre: String,
    val asignatura: String, val parcial1: Double,
    val parcial2: Double
) {

    fun obtenerDatos(): String {
        return "No de cuenta: $noCuenta \n" +
                "Nombre: $nombre \n" +
                "Asignatura: $asignatura \n" +
                "Parcial 1: $parcial1 \n" +
                "Parcial 2: $parcial2"
    }
}

fun main() {
    val alumno1 = Alumno(
        "20103601", "Juan Pérez",
        "Programación I", 10.0, 1.5
    )
    println(alumno1.obtenerDatos())
    println("-".repeat(100))

    val alumno2= Alumno("20103602", "María López",
        "Programación I", 6.0, 7.0)
    println(alumno2.obtenerDatos())
}